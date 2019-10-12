package com.example.gestur.view.main;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TextInputLayout;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gestur.DB.DB;
import com.example.gestur.R;
import com.example.gestur.view.CanvasView;

public class RegisterUserActivity extends AbstractActivity implements IRegisterUserConstants, IObservable {

    private TextView textTitle;
    private TextView textRegister;

    private EditText editIdNumber;
    private TextInputLayout editIdNumberLayout;

    private EditText editFullName;
    private TextInputLayout editFullNameLayout;

    private EditText editEmail;
    private TextInputLayout editEmailLayout;

    private EditText editUserName;
    private TextInputLayout editUserNameLayout;

    private EditText editPassword;
    private TextInputLayout editPasswordLayout;

    private EditText editConfirmPassword;
    private TextInputLayout editConfirmPasswordLayout;

    private TextView textBornDate;

    private TextView textDay;
    private TextView textMonth;
    private TextView textYear;

    private Spinner spinnerDay;
    private Spinner spinnerMonth;
    private Spinner spinnerYear;


    private EditText editPhone;
    private TextInputLayout editPhoneLayout;

    private Button buttonAddPhoneField;

    private Button buttonCompleteRegister;
    private TrackableScrollView scroll;

    private String userName;
    private String idNumber;
    private String phoneNumber;
    private String password;
    private String fullName;
    private String emailAddress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        scroll = findViewById(R.id.scrollRegisterUser);
        layout = findViewById(R.id.layoutRegisterUser);
        createItems();
        setItemsConfiguration();
        setItemsBounds();

        addComponents();
        layout.setMinHeight(totalY+100);
        setFocusListeners();
        configCanvas();
    }
    private void setFocusListeners()
    {

        buttonCompleteRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateRegister();
            }
        });
        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                scroll.setScrollingEnabled(true);
                editIdNumber.clearFocus();
                editFullName.clearFocus();
                editEmail.clearFocus();
                editUserName.clearFocus();
                editPassword.clearFocus();
                editConfirmPassword.clearFocus();
                editPhone.clearFocus();
                return false;
            }
        });
        editIdNumber.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    scroll.scrollTo(0, (int) editIdNumberLayout.getY()-20);
                    scroll.setScrollingEnabled(false);
                }else{
                    scroll.setScrollingEnabled(true);
                }
            }
        });
        editFullName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    scroll.scrollTo(0, (int) editFullNameLayout.getY()-20);
                    scroll.setScrollingEnabled(false);
                }else{
                    scroll.setScrollingEnabled(true);
                }
            }
        });
        editEmail.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    scroll.scrollTo(0, (int) editEmailLayout.getY()-20);
                    scroll.setScrollingEnabled(false);
                }else{
                    scroll.setScrollingEnabled(true);
                }
            }
        });
        editUserName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    scroll.scrollTo(0, (int) editUserNameLayout.getY()-20);
                    scroll.setScrollingEnabled(false);
                }else{
                    scroll.setScrollingEnabled(true);
                }
            }
        });
        editPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    scroll.scrollTo(0, (int) editPasswordLayout.getY()-20);
                    scroll.setScrollingEnabled(false);
                }else{
                    scroll.setScrollingEnabled(true);
                }
            }
        });
        editConfirmPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    scroll.scrollTo(0, (int) editConfirmPasswordLayout.getY()-20);
                    scroll.setScrollingEnabled(false);
                }else{
                    scroll.setScrollingEnabled(true);
                }
            }
        });
        editPhone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    scroll.scrollTo(0, (int) editPhoneLayout.getY()-20);
                    scroll.setScrollingEnabled(false);
                }else{
                    scroll.setScrollingEnabled(true);
                }
            }
        });
        spinnerMonth.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                loadSpinnerDays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private boolean validateRegister()
    {
        if(validateUserId() & validateFullName() & validateEmail() & validateUserName() & validatePasswords() & validatePhoneNumber()){
            String day = spinnerDay.getSelectedItem().toString();
            String month = spinnerMonth.getSelectedItem().toString();
            String year = spinnerYear.getSelectedItem().toString();
            String date = day+"/"+month+"/"+year;
            DB.getInstance().registerUser(idNumber,fullName,emailAddress,userName,password,date,phoneNumber,this);
        }
        return true;
    }

    @Override// 1 para exito, 2 para error
    public void notifyObservable(int n,String msg) {
        if(n == 1){
            startActivity(new Intent(context, LobbyActivity.class));
            Toast.makeText(this, "DATOS CORRECTOS, BIENVENIDO", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validateUserId()
    {
        idNumber = editIdNumberLayout.getEditText().getText().toString().trim();
        if(idNumber.isEmpty()){
            editIdNumberLayout.setError("El campo no puede quedar vacío");
            return false;
        }
        if(idNumber.length()!=9){
            editIdNumberLayout.setError("El número debe tener 9 dígitos");
            return false;
        }
        editIdNumberLayout.setError(null);
        return true;
    }
    private boolean validateFullName()
    {
        fullName = editFullNameLayout.getEditText().getText().toString().trim();
        String[] names = fullName.split(" ");
        if(fullName.isEmpty()){
            editFullNameLayout.setError("El campo no puede quedar vacío");
            return false;
        }
        if(names.length<=2){
            editFullNameLayout.setError("Mínimo 1 nombre y 2 apellidos");
            return false;
        }
        editFullNameLayout.setError(null);
        return true;
    }

    private boolean validateEmail()
    {
        emailAddress = editEmailLayout.getEditText().getText().toString().trim();
        if(emailAddress.isEmpty()){
            editEmailLayout.setError("El campo no puede quedar vacío");
            return false;
        }
        if(!validateEmailAddress(emailAddress)){
            editEmailLayout.setError("Email inválido");
            return false;
        }else{
            editEmailLayout.setError(null);
            return true;
        }

    }

    private boolean validateUserName()
    {
        userName = editUserNameLayout.getEditText().getText().toString().trim();
        if(userName.isEmpty()){
            editUserNameLayout.setError("El campo no puede quedar vacío");
            return false;
        }
        editUserNameLayout.setError(null);
        //Database search
        return true;
    }
    private boolean validatePasswords()
    {
        password = editPasswordLayout.getEditText().getText().toString().trim();
        String password2 = editConfirmPasswordLayout.getEditText().getText().toString().trim();
        if(password.isEmpty() || password2.isEmpty()) {
            if (password.isEmpty()) {
                editPasswordLayout.setError("El campo no puede quedar vacío");
            }
            if (password2.isEmpty()) {
                editConfirmPasswordLayout.setError("El campo no puede quedar vacío");
            }
            return false;
        }
        if(password.length() < 8 || password2.length() < 8){
            if (password.length() < 8) {
                editPasswordLayout.setError("Mínimo 8 caracteres");
            }
            if (password2.length() < 8) {
                editConfirmPasswordLayout.setError("Mínimo 8 caracteres");
            }
            return false;
        }
        if(!password.equals(password2)){
            editPasswordLayout.setError("Las contraseñas no coinciden");
            editConfirmPasswordLayout.setError("Las contraseñas no coinciden");
            return false;
        }else{
            editPasswordLayout.setError(null);
            editConfirmPasswordLayout.setError(null);
            return true;
        }
    }

    private boolean validatePhoneNumber()
    {
        phoneNumber = editPhoneLayout.getEditText().getText().toString().trim();
        if(phoneNumber.isEmpty()){
            editPhoneLayout.setError("El campo no puede quedar vacío");
            return false;
        }
        if(phoneNumber.length()!=8){
            editPhoneLayout.setError("El número debe tener 8 dígitos");
            return false;
        }else{
            editPhoneLayout.setError(null);
            return true;
        }
    }

    private void addComponents()
    {
        layout.addView(textTitle);
        layout.addView(textRegister);

        layout.addView(editIdNumberLayout);
        layout.addView(editFullNameLayout);
        layout.addView(editEmailLayout);
        layout.addView(editUserNameLayout);
        layout.addView(editPasswordLayout);
        layout.addView(editConfirmPasswordLayout);

        layout.addView(textBornDate);
        layout.addView(textDay);
        layout.addView(textMonth);
        layout.addView(textYear);
        layout.addView(spinnerDay);
        layout.addView(spinnerMonth);
        layout.addView(spinnerYear);

        layout.addView(editPhoneLayout);

        //layout.addView(buttonAddPhoneField);
        layout.addView(buttonCompleteRegister);
    }

    @Override
    protected void setItemsConfiguration(){
        int titleSize = getTextSize(15);
        int title2Size = getTextSize(39);
        int textSize = getTextSize(50);
        int editSize = getTextSize(42);

        textTitle.setText(text_Title);
        textTitle.setTextSize(titleSize);
        textTitle.setGravity(Gravity.CENTER);

        textRegister.setText(text_Register);
        textRegister.setGravity(Gravity.CENTER);
        textRegister.setTextSize(title2Size);

        //editIdNumber.setBackgroundColor(Color.rgb(215,215,215));
        editIdNumber.setTextSize(editSize);
        editIdNumber.setHint(text_Id);
        editIdNumber.setInputType(InputType.TYPE_CLASS_NUMBER);
        editIdNumberLayout.setErrorEnabled(true);
        editIdNumberLayout.setCounterEnabled(true);
        editIdNumberLayout.setCounterMaxLength(9);

        editFullName.setTextSize(editSize);
        //editFullName.setBackgroundColor(Color.rgb(215,215,215));
        editFullName.setHint(text_Full_Name);
        editFullNameLayout.setErrorEnabled(true);

        editEmail.setTextSize(editSize);
        //editEmail.setBackgroundColor(Color.rgb(215,215,215));
        editEmail.setHint(text_Email);
        editEmailLayout.setErrorEnabled(true);

        editUserName.setTextSize(editSize);
        //editUserName.setBackgroundColor(Color.rgb(215,215,215));
        editUserName.setHint(text_userName);
        editUserNameLayout.setErrorEnabled(true);


        editPassword.setTextSize(editSize);
        //editPassword.setBackgroundColor(Color.rgb(215,215,215));
        editPassword.setHint(text_Password);
        editPassword.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
        editPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editPasswordLayout.setCounterEnabled(true);
        editPasswordLayout.setErrorEnabled(true);


        editConfirmPassword.setTextSize(editSize);
        editConfirmPassword.setHint(text_Confirm_Password);
        editConfirmPasswordLayout.setErrorEnabled(true);
        editConfirmPasswordLayout.setCounterEnabled(true);
        editConfirmPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());

        textBornDate.setText(text_Born_Date);
        textBornDate.setTextSize(textSize);

        textDay.setText(text_day);
        textDay.setTextSize(textSize);

        textMonth.setText(text_month);
        textMonth.setTextSize(textSize);

        textYear.setText(text_year);
        textYear.setTextSize(textSize);

        editPhone.setTextSize(editSize);
        //editPhone.setBackgroundColor(Color.rgb(215,215,215));
        editPhone.setHint(text_Phone_Numbers);
        editPhone.setInputType(InputType.TYPE_CLASS_PHONE);
        editPhoneLayout.setErrorEnabled(true);
        editPhoneLayout.setCounterEnabled(true);
        editPhoneLayout.setCounterMaxLength(8);

        buttonCompleteRegister.setText(text_Complete_Register);
        buttonCompleteRegister.setTextSize(textSize);

        buttonAddPhoneField.setText("+");
        buttonAddPhoneField.setTextSize(textSize);

        loadSpinnerYears();
        loadSpinnerMonths();
        loadSpinnerDays();
    }

    private void loadSpinnerYears(){
        spinnerYear.setAdapter(new ArrayAdapter<Integer>(context,android.R.layout.simple_spinner_item, DateManager.getYears()));
        spinnerYear.setSelection(0);
    }
    private void loadSpinnerMonths(){
        spinnerMonth.setAdapter(new ArrayAdapter<Integer>(context,android.R.layout.simple_spinner_item, DateManager.getMonths()));
        spinnerMonth.setSelection(0);
    }
    private void loadSpinnerDays(){
        spinnerDay.setAdapter(new ArrayAdapter<Integer>(context,
                android.R.layout.simple_spinner_item,
                DateManager.getDaysFromMonth((Integer)spinnerMonth.getSelectedItem(),(Integer)spinnerYear.getSelectedItem())));
        spinnerDay.setSelection(0);
    }
    @Override
    protected void setItemsBoundsVertical(){
        setBounds(textTitle,1,titleHeight_V,0);
        setBounds(textRegister,1,textHeight_V,0);
        addSpace(5,100);

        setTextInputLayoutBounds(editIdNumberLayout,editIdNumber,editWidth_V,editHeight_V,editX_V);
        addSpace(5,100);

        setTextInputLayoutBounds(editFullNameLayout,editFullName,editWidth_V,editHeight_V,editX_V);
        addSpace(5,100);

        setTextInputLayoutBounds(editEmailLayout,editEmail,editWidth_V,editHeight_V,editX_V);
        addSpace(5,100);

        setTextInputLayoutBounds(editUserNameLayout,editUserName,editWidth_V,editHeight_V,editX_V);
        addSpace(5,100);

        setTextInputLayoutBounds(editPasswordLayout,editPassword,editWidth_V,editHeight_V,editX_V);
        addSpace(5,100);

        setTextInputLayoutBounds(editConfirmPasswordLayout,editConfirmPassword,editWidth_V,editHeight_V,editX_V);
        addSpace(5,100);

        setBounds(textBornDate,textWidth_V,textHeight_V,textX_V);
        setBounds(textDay,textDate_Width,textHeight_V,textDayX_V);
        totalY-=(height*textHeight_V);
        setBounds(textMonth,textDate_Width,textHeight_V,textMonthX_V);
        totalY-=(height*textHeight_V);
        setBounds(textYear,textDate_Width,textHeight_V,textYearX_V);
        setSpinnerBounds(spinnerDay,editDate_Width,editHeight_V,editDayX_V);
        totalY-=(height*editHeight_V);
        setSpinnerBounds(spinnerMonth,editDate_Width,editHeight_V,editMonthX_V);
        totalY-=(height*editHeight_V);
        setSpinnerBounds(spinnerYear,editDate_Width,editHeight_V,editYearX_V);
        addSpace(5,100);

        setTextInputLayoutBounds(editPhoneLayout,editPhone,editWidth_V,editHeight_V,editX_V);

        totalY-=(height*editHeight_V);
        setBounds(buttonAddPhoneField,buttonPlusWidth_V,editHeight_V,buttonPlusX_V);
        addSpace(5,100);
        setBounds(buttonCompleteRegister,buttonWidth_V,editHeight_V,buttonX_V);
    }
    @Override
    protected void setItemsBoundsHorizontal(){
        //addSpace(3);
        //setBounds(textTitle1,titleWidth,titleHeight,titleX);
        //setBounds(textTitle2,titleWidth,titleHeight,titleX);
        //setBounds(textTitle3,titleWidth,titleHeight,titleX);
        //setBounds(textName,nameWidth,nameHeight,nameX);
    }
    private void createItems(){
        textTitle = new TextView(this);
        textRegister = new TextView(this);

        editIdNumber = new EditText(this);
        editIdNumberLayout = new TextInputLayout(this);

        editFullName = new EditText(this);
        editFullNameLayout = new TextInputLayout(this);

        editEmail = new EditText(this);
        editEmailLayout = new TextInputLayout(this);

        editUserName = new EditText(this);
        editUserNameLayout = new TextInputLayout(this);

        editPassword = new EditText(this);
        editPasswordLayout = new TextInputLayout(this);//findViewById(R.id.text_input_password_1);

        editConfirmPassword = new EditText(this);
        editConfirmPasswordLayout = new TextInputLayout(this);//findViewById(R.id.text_input_password_2);

        textBornDate = new TextView(this);
        textDay = new TextView(this);
        textMonth = new TextView(this);
        textYear = new TextView(this);
        spinnerDay = new Spinner(this);
        spinnerMonth = new Spinner(this);
        spinnerYear = new Spinner(this);

        editPhone = new EditText(this);
        editPhoneLayout = new TextInputLayout(this);

        buttonAddPhoneField = new Button(this);
        buttonCompleteRegister = new Button(this);
    }
    private void configCanvas(){
        canvasView = new CanvasView(context,width,height,0,totalY);
        canvasView.setBackgroundColor(Color.CYAN);
       /* canvasView.addLine(numberX,0,percentageWitdh+percentageX,0);
        float k = questionBannerHeight;
        canvasView.addLine(numberX,k,percentageWitdh+percentageX,questionBannerHeight);
        for(int i = 0;i<form.getChapters().size();i++){
            k+=questionHeight;
            canvasView.addLine(numberX,k,percentageWitdh+percentageX,k);
        }
        k+=questionBannerHeight;
        canvasView.addLine(numberX,k,percentageWitdh+percentageX,k);

        canvasView.addLine(numberX,0,numberX,totalY);
        canvasView.addLine(questionX,0,questionX,totalY);
        canvasView.addLine(pointsX,0,pointsX,totalY);
        canvasView.addLine(percentageX,0,percentageX,totalY);
        canvasView.addLine(percentageX+percentageWitdh,0,percentageX+percentageWitdh,totalY);

        canvasView.draw(new Canvas(Bitmap.createBitmap(width,totalY, Bitmap.Config.ARGB_8888)));
        canvasView.setX(0);
        canvasView.setY(layoutY);
        layout.addView(canvasView); */
    }
}
