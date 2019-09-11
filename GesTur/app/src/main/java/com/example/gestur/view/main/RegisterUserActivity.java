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
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.gestur.R;
import com.example.gestur.view.IRegisterUserConstants;

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
    private Spinner day;
    private Spinner month;
    private Spinner year;

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
            setItemsXHorizontal(); //Falta
            setItemsYHorizontal(); //Falta
            setItemsWidthHorizontal(); //Falta
            setItemsHeightHorizontal(); //Falta
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
        layout.addView(day);
        layout.addView(month);
        layout.addView(year);
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
        textRegister.setTextSize(20);

        textIdNumber.setText(text_Id);
        textFullName.setText(text_Full_Name);
        textEmail.setText(text_Email);
        textUserName.setText(text_userName);
        textPassword.setText(text_Password);
        textConfirmPassword.setText(text_Confirm_Password);
        textBornDate.setText(text_Born_Date);
        textPhone.setText(text_Phone_Numbers);

        buttonCompleteRegister.setText(text_Complete_Register);
        buttonAddPhoneField.setText("+");

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
        day.setX(width*editDayX_V);
        month.setX(width*editMonthX_V);
        year.setX(width*editYearX_V);
        textPhone.setX(width*textX_V);
        editPhone.setX(width*editPhoneX_V);
        buttonAddPhoneField.setX(width*buttonPlusX_V);
        buttonCompleteRegister.setX(width*buttonX_V);
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

        setY(day,(height*editHeight_V));
        totalY-=(height*editHeight_V);
        setY(month,(height*editHeight_V));
        totalY-=(height*editHeight_V);
        setY(year,(height*editHeight_V));
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
        day.setMinimumWidth((int)(width*editDate_Width));
        month.setMinimumWidth((int)(width*editDate_Width));
        year.setMinimumWidth((int)(width*editDate_Width));
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
        day.setMinimumHeight((int)(height*editHeight_V));
        month.setMinimumHeight((int)(height*editHeight_V));
        year.setMinimumHeight((int)(height*editHeight_V));
        textPhone.setHeight((int)(height*textHeight_V));
        editPhone.setHeight((int)(height*editHeight_V));
        buttonAddPhoneField.setHeight((int)(height*editHeight_V));
        buttonCompleteRegister.setHeight((int)(height*editHeight_V));
    }

    private void setItemsXHorizontal(){
/*
        textTitle.setX(width*titleX_H);
        editUserName.setX(width*editX_H);
        editPassword.setX(width*editX_H);
        checkRemember.setX(width*checkBoxX_H);
        buttonLogin.setX(width*buttonL_H);
        textNoAccount.setX(width*textNoAccountX_H);
        buttonRegister.setX(width*buttonR_H);
        */
    }
    private void setItemsYHorizontal(){
        /*
        totalY = 0;
        setY(textTitle,titleHeight_H*height);
        setY(textNoAccount,texNoCountHeight_H*height);
        totalY+=(space1p_H*height);
        setY(buttonRegister,buttonHeight_H*height);

        totalY=(int)(initialY_H*height);

        setY(editUserName,height*editHeight_H);
        totalY+=(space1p_H*height);
        setY(editPassword,height*editHeight_H);
        totalY+=(space1p_H*height);
        totalY+=(space1p_H*height);
        totalY+=(space1p_H*height);
        totalY+=(space1p_H*height);
        setY(checkRemember,checkBoxHeight_H*height);
        totalY+=(space1p_H*height);
        setY(buttonLogin,buttonHeight_H*height);
        */
    }
    private void setItemsHeightHorizontal(){
        /*
        textTitle.setWidth((int)(width*titleWidth_H));
        textTitle.setHeight((int)(height*titleHeight_H));

        editUserName.setWidth((int)(width*editWidth_H));
        editUserName.setHeight((int)(height*editHeight_H));

        editPassword.setWidth((int)(width*editWidth_H));
        editPassword.setHeight((int)(height*editHeight_H));

        checkRemember.setWidth((int)(checkBoxWidth_H*width));
        checkRemember.setHeight((int)(checkBoxHeight_H*height));

        buttonLogin.setWidth((int)(buttonWidth_H*width));
        buttonLogin.setHeight((int)(buttonHeight_H*height));

        textNoAccount.setWidth((int)(textNoAccountWidth_H*width));
        textNoAccount.setHeight((int)(texNoCountHeight_H*height));

        buttonRegister.setWidth((int)(buttonWidth_H*width));
        buttonRegister.setHeight((int)(buttonHeight_H*height));
        */
    }
    private void setItemsWidthHorizontal(){

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
        day = new Spinner(this);
        month = new Spinner(this);
        year = new Spinner(this);
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
