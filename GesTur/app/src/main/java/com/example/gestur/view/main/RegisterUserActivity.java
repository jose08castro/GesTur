package com.example.gestur.view.main;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.gestur.R;

public class RegisterUserActivity extends AppCompatActivity implements IRegisterUserConstants {
    final Context context = this;
    private int width;
    private int height;

    private TextView textTitle;
    private TextView textRegister;

    private TextView textIdNumber;
    private EditText editIdNumber;

    private TextView textFullName;
    private EditText editFullName;

    private TextView textEmail;
    private EditText editEmail;

    private TextView textUserName;
    private EditText editUserName;

    private TextView textPassword;
    private EditText editPassword;

    private TextView textConfirmPassword;
    private EditText editConfirmPassword;

    private TextView textBornDate;

    private TextView textDay;
    private TextView textMonth;
    private TextView textYear;

    private Spinner spinnerDay;
    private Spinner spinnerMonth;
    private Spinner spinnerYear;

    private TextView textPhone;
    private EditText editPhone;
    private Button buttonAddPhoneField;

    private Button buttonCompleteRegister;

    private ConstraintLayout layout;
    private int totalY;

    private TrackableScrollView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        scroll = findViewById(R.id.scrollRegisterUser);

        totalY = 0;
        layout = findViewById(R.id.layoutRegisterUser);
        getScreenSizes();
        createItems();
        setItemsConfig();

        if(width<height){
            setItemsBoundsVertical();
        }else{
            setItemsBoundsHorizontal();//Falta
        }
        addComponents();
        layout.setMinHeight(totalY+100);
        setFocusListeners();
    }
    private void setFocusListeners(){
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
                    scroll.scrollTo(0, (int) textIdNumber.getY());
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
                    scroll.scrollTo(0, (int) textFullName.getY());
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
                    scroll.scrollTo(0, (int) textEmail.getY());
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
                    scroll.scrollTo(0, (int) textUserName.getY());
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
                    scroll.scrollTo(0, (int) textPassword.getY());
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
                    scroll.scrollTo(0, (int) textConfirmPassword.getY());
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
                    scroll.scrollTo(0, (int) textPhone.getY());
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

    private void addComponents(){
        layout.addView(textTitle);
        layout.addView(textRegister);
        layout.addView(textIdNumber);
        layout.addView(editIdNumber);
        layout.addView(textFullName);
        layout.addView(editFullName);
        layout.addView(textEmail);
        layout.addView(editEmail);
        layout.addView(textUserName);
        layout.addView(editUserName);
        layout.addView(textPassword);
        layout.addView(editPassword);
        layout.addView(textConfirmPassword);
        layout.addView(editConfirmPassword);
        layout.addView(textBornDate);
        layout.addView(textDay);
        layout.addView(textMonth);
        layout.addView(textYear);
        layout.addView(spinnerDay);
        layout.addView(spinnerMonth);
        layout.addView(spinnerYear);
        layout.addView(textPhone);
        layout.addView(editPhone);
        layout.addView(buttonAddPhoneField);
        layout.addView(buttonCompleteRegister);
    }
    private void setItemsConfig(){
        int titleSize = width/15;
        int title2Size = width/39;
        int textSize = width/50;
        int editSize = width/42;

        textTitle.setText(text_Title);
        textTitle.setTextSize(titleSize);
        textTitle.setGravity(Gravity.CENTER);

        textRegister.setText(text_Register);
        textRegister.setGravity(Gravity.CENTER);
        textRegister.setTextSize(title2Size);

        textIdNumber.setText(text_Id);
        textIdNumber.setTextSize(textSize);

        editIdNumber.setBackgroundColor(Color.rgb(210,210,210));
        editIdNumber.setTextSize(editSize);

        textFullName.setText(text_Full_Name);
        textFullName.setTextSize(textSize);

        editFullName.setTextSize(editSize);
        editFullName.setBackgroundColor(Color.rgb(210,210,210));

        textEmail.setText(text_Email);
        textEmail.setTextSize(textSize);

        editEmail.setTextSize(editSize);
        editEmail.setBackgroundColor(Color.rgb(210,210,210));

        textUserName.setText(text_userName);
        textUserName.setTextSize(textSize);

        editUserName.setTextSize(editSize);
        editUserName.setBackgroundColor(Color.rgb(210,210,210));

        textPassword.setText(text_Password);
        textPassword.setTextSize(textSize);

        editPassword.setTextSize(editSize);
        editPassword.setBackgroundColor(Color.rgb(210,210,210));
        editPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());

        textConfirmPassword.setText(text_Confirm_Password);
        textConfirmPassword.setTextSize(textSize);

        editConfirmPassword.setTextSize(editSize);
        editConfirmPassword.setBackgroundColor(Color.rgb(210,210,210));
        editConfirmPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());

        textBornDate.setText(text_Born_Date);
        textBornDate.setTextSize(textSize);

        textDay.setText(text_day);
        textDay.setTextSize(textSize);

        textMonth.setText(text_month);
        textMonth.setTextSize(textSize);

        textYear.setText(text_year);
        textYear.setTextSize(textSize);

        textPhone.setText(text_Phone_Numbers);
        textPhone.setTextSize(textSize);

        editPhone.setTextSize(editSize);
        editPhone.setBackgroundColor(Color.rgb(210,210,210));

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
    private void setItemsBoundsVertical(){
        setBounds(textTitle,1,titleHeight_V,0);
        setBounds(textRegister,1,textHeight_V,0);
        addSpace(5);
        setBounds(textIdNumber,textWidth_V,textHeight_V,textX_V);
        setBounds(editIdNumber,editWidth_V,editHeight_V,editX_V);
        addSpace(5);
        setBounds(textFullName,textWidth_V,textHeight_V,textX_V);
        setBounds(editFullName,editWidth_V,editHeight_V,editX_V);
        addSpace(5);
        setBounds(textEmail,textWidth_V,textHeight_V,textX_V);
        setBounds(editEmail,editWidth_V,editHeight_V,editX_V);
        addSpace(5);
        setBounds(textUserName,textWidth_V,textHeight_V,textX_V);
        setBounds(editUserName,editWidth_V,editHeight_V,editX_V);
        addSpace(5);
        setBounds(textPassword,textWidth_V,textHeight_V,textX_V);
        setBounds(editPassword,editWidth_V,editHeight_V,editX_V);
        addSpace(5);
        setBounds(textConfirmPassword,textWidth_V,textHeight_V,textX_V);
        setBounds(editConfirmPassword,editWidth_V,editHeight_V,editX_V);
        addSpace(5);
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
        addSpace(5);
        setBounds(textPhone,textWidth_V,textHeight_V,textX_V);
        setBounds(editPhone,editPhoneWidth_V,editHeight_V,editPhoneX_V);
        totalY-=(height*editHeight_V);
        setBounds(buttonAddPhoneField,buttonPlusWidth_V,editHeight_V,buttonPlusX_V);
        addSpace(5);
        setBounds(buttonCompleteRegister,buttonWidth_V,editHeight_V,buttonX_V);

    }
    private void setItemsBoundsHorizontal(){
        //addSpace(3);
        //setBounds(textTitle1,titleWidth,titleHeight,titleX);
        //setBounds(textTitle2,titleWidth,titleHeight,titleX);
        //setBounds(textTitle3,titleWidth,titleHeight,titleX);
        //setBounds(textName,nameWidth,nameHeight,nameX);
    }
    private void setSpinnerBounds(Spinner spinner,float w,float h, float x){
        spinner.setMinimumWidth((int)(w*width));
        spinner.setMinimumHeight((int)(h*height));
        spinner.setX(x*width);
        spinner.setY(totalY);
        totalY+=((int)(h*height));
    }
    private void setBounds(TextView view, float w, float h, float x){
        view.setWidth((int)(w*width));
        view.setHeight((int)(h*height));
        view.setX(x*width);
        view.setY(totalY);
        totalY+=((int)(h*height));
    }
    private void addSpace(int space){
        totalY+=(space*height/100);
    }


    private void createItems(){
        textTitle = new TextView(this);
        textRegister = new TextView(this);
        textIdNumber = new TextView(this);
        editIdNumber = new EditText(this);
        textFullName = new TextView(this);
        editFullName = new EditText(this);
        textEmail = new TextView(this);
        editEmail = new EditText(this);
        textUserName = new TextView(this);
        editUserName = new EditText(this);
        textPassword = new TextView(this);
        editPassword = new EditText(this);
        textConfirmPassword = new TextView(this);
        editConfirmPassword = new EditText(this);
        textBornDate = new TextView(this);
        textDay = new TextView(this);
        textMonth = new TextView(this);
        textYear = new TextView(this);
        spinnerDay = new Spinner(this);
        spinnerMonth = new Spinner(this);
        spinnerYear = new Spinner(this);
        textPhone = new TextView(this);
        editPhone = new EditText(this);
        buttonAddPhoneField = new Button(this);
        buttonCompleteRegister = new Button(this);
    }

    private void getScreenSizes()
    {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
    }
}
