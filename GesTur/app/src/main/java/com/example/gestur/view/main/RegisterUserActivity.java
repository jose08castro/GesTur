package com.example.gestur.view.main;

import android.content.Context;
import android.graphics.Point;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
            setItemsXVertical();
            setItemsYVertical();
            setItemsWidthVertical();
            setItemsHeightVertical();
        }else{
            //setItemsXHorizontal(); //Falta
            //setItemsYHorizontal(); //Falta
            //setItemsWidthHorizontal(); //Falta
            //setItemsHeightHorizontal(); //Falta
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

        textTitle.setText(text_Title);
        textTitle.setTextSize(72);
        textTitle.setGravity(Gravity.CENTER);

        textRegister.setText(text_Register);
        textRegister.setGravity(Gravity.CENTER);
        textRegister.setTextSize(26);

        textIdNumber.setText(text_Id);
        textIdNumber.setTextSize(20);

        textFullName.setText(text_Full_Name);
        textFullName.setTextSize(20);

        textEmail.setText(text_Email);
        textEmail.setTextSize(20);

        textUserName.setText(text_userName);
        textUserName.setTextSize(20);

        textPassword.setText(text_Password);
        textPassword.setTextSize(20);

        textConfirmPassword.setText(text_Confirm_Password);
        textConfirmPassword.setTextSize(20);

        textBornDate.setText(text_Born_Date);
        textBornDate.setTextSize(20);

        textDay.setText(text_day);
        textDay.setTextSize(20);
        textDay.setGravity(Gravity.CENTER);

        textMonth.setText(text_month);
        textMonth.setTextSize(20);
        textMonth.setGravity(Gravity.CENTER);

        textYear.setText(text_year);
        textYear.setTextSize(20);
        textYear.setGravity(Gravity.CENTER);

        textPhone.setText(text_Phone_Numbers);

        buttonCompleteRegister.setText(text_Complete_Register);
        buttonAddPhoneField.setText("+");

        loadSpinnerYears();
        loadSpinnerMonths();
        loadSpinnerDays();

    }

    private void setItemsXVertical(){
        textTitle.setX(width*titleX_V);
        textRegister.setX(width*titleRegisterX_V);
        textIdNumber.setX(width*textX_V);
        editIdNumber.setX(width*editX_V);
        textFullName.setX(width*textX_V);
        editFullName.setX(width*editX_V);
        textEmail.setX(width*textX_V);
        editEmail.setX(width*editX_V);
        textUserName.setX(width*textX_V);
        editUserName.setX(width*editX_V);
        textPassword.setX(width*textX_V);
        editPassword.setX(width*editX_V);
        textConfirmPassword.setX(width*textX_V);
        editConfirmPassword.setX(width*editX_V);
        textBornDate.setX(width*textX_V);

        textDay.setX(width*textDayX_V);
        textMonth.setX(width*textMonthX_V);
        textYear.setX(width*textYearX_V);

        spinnerDay.setX(width*editDayX_V);
        spinnerMonth.setX(width*editMonthX_V);
        spinnerYear.setX(width*editYearX_V);
        textPhone.setX(width*textX_V);
        editPhone.setX(width*editPhoneX_V);
        buttonAddPhoneField.setX(width*buttonPlusX_V);
        buttonCompleteRegister.setX(width*buttonX_V);
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


    private void setItemsYVertical(){

        totalY = 0;
        totalY+=(spaceY_V*height);
        setY(textTitle,(titleHeight_V*height));
        setY(textRegister,(textHeight_V*height));
        totalY+=(spaceY_V*height);
        setY(textIdNumber,(height*textHeight_V));
        setY(editIdNumber,(height*editHeight_V));
        setY(textFullName,(height*textHeight_V));
        setY(editFullName,(height*editHeight_V));
        setY(textEmail,(height*textHeight_V));
        setY(editEmail,(height*editHeight_V));
        setY(textUserName,(height*textHeight_V));
        setY(editUserName,(height*editHeight_V));
        setY(textPassword,(height*textHeight_V));
        setY(editPassword,(height*editHeight_V));
        setY(textConfirmPassword,(height*textHeight_V));
        setY(editConfirmPassword,(height*editHeight_V));
        setY(textBornDate,(height*textHeight_V));

        setY(textDay,(height*textHeight_V));
        totalY-=(height*textHeight_V);
        setY(textMonth,(height*textHeight_V));
        totalY-=(height*textHeight_V);
        setY(textYear,(height*textHeight_V));

        setY(spinnerDay,(height*editHeight_V));
        totalY-=(height*editHeight_V);
        setY(spinnerMonth,(height*editHeight_V));
        totalY-=(height*editHeight_V);
        setY(spinnerYear,(height*editHeight_V));

        setY(textPhone,(height*textHeight_V));
        setY(editPhone,(height*editHeight_V));
        totalY-=(height*editHeight_V);
        setY(buttonAddPhoneField,(height*editHeight_V));
        totalY+=(spaceY_V*height);
        setY(buttonCompleteRegister,(height*editHeight_V));

    }
    private void setItemsWidthVertical(){
        textTitle.setWidth((int)(width*titleWidth_V));
        textRegister.setWidth((int)(width*titleRegisterWidth_V));
        textIdNumber.setWidth((int)(width*textWidth_V));
        editIdNumber.setWidth((int)(width*editWidth_V));
        textFullName.setWidth((int)(width*textWidth_V));
        editFullName.setWidth((int)(width*editWidth_V));
        textEmail.setWidth((int)(width*textWidth_V));
        editEmail.setWidth((int)(width*editWidth_V));
        textUserName.setWidth((int)(width*textWidth_V));
        editUserName.setWidth((int)(width*editWidth_V));
        textPassword.setWidth((int)(width*textWidth_V));
        editPassword.setWidth((int)(width*editWidth_V));
        textConfirmPassword.setWidth((int)(width*textWidth_V));
        editConfirmPassword.setWidth((int)(width*editWidth_V));
        textBornDate.setWidth((int)(width*textWidth_V));

        textDay.setWidth((int)(textDate_Width*width));
        textMonth.setWidth((int)(textDate_Width*width));
        textYear.setWidth((int)(textDate_Width*width));

        spinnerYear.setMinimumWidth((int)(width*editDate_Width));
        spinnerMonth.setMinimumWidth((int)(width*editDate_Width));
        spinnerDay.setMinimumWidth((int)(width*editDate_Width));
        textPhone.setWidth((int)(width*textWidth_V));
        editPhone.setWidth((int)(width*editPhoneWidth_V));
        buttonAddPhoneField.setWidth((int)(width*buttonPlusWidth_V));
        buttonCompleteRegister.setWidth((int)(width*buttonWidth_V));
    }
    private void setItemsHeightVertical(){
        textTitle.setHeight((int)(height*titleHeight_V));
        textRegister.setHeight((int)(height*textHeight_V));
        textIdNumber.setHeight((int)(height*textHeight_V));
        editIdNumber.setHeight((int)(height*editHeight_V));
        textFullName.setHeight((int)(height*textHeight_V));
        editFullName.setHeight((int)(height*editHeight_V));
        textEmail.setHeight((int)(height*textHeight_V));
        editEmail.setHeight((int)(height*editHeight_V));
        textUserName.setHeight((int)(height*textHeight_V));
        editUserName.setHeight((int)(height*editHeight_V));
        textPassword.setHeight((int)(height*textHeight_V));
        editPassword.setHeight((int)(height*editHeight_V));
        textConfirmPassword.setHeight((int)(height*textHeight_V));
        editConfirmPassword.setHeight((int)(height*editHeight_V));
        textBornDate.setHeight((int)(height*textHeight_V));

        textDay.setHeight((int)(height*textHeight_V));
        textMonth.setHeight((int)(height*textHeight_V));
        textYear.setHeight((int)(height*textHeight_V));

        spinnerDay.setMinimumHeight((int)(height*editHeight_V));
        spinnerMonth.setMinimumHeight((int)(height*editHeight_V));
        spinnerYear.setMinimumHeight((int)(height*editHeight_V));
        textPhone.setHeight((int)(height*textHeight_V));
        editPhone.setHeight((int)(height*editHeight_V));
        buttonAddPhoneField.setHeight((int)(height*editHeight_V));
        buttonCompleteRegister.setHeight((int)(height*editHeight_V));
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
    private void setY(View view, float value){
        view.setY(totalY);
        totalY+=value;
    }
}
