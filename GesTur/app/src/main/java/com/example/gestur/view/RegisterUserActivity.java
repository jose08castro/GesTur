package com.example.gestur.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.gestur.R;

public class RegisterUserActivity extends AppCompatActivity {
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
    private Button buttonAddPhoneField;

    private Button buttonCompleteRegister;



    private ConstraintLayout layout;
    private int totalY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        getScreenSizes();
        createItems();
        setItemsConfig();
        if(width>height){
            setItemsXHorizontal();
            setItemsYHorizontal();
            setItemsSizesHorizontal();
        }
        if(width<height){
            setItemsXVertical();
            setItemsYVertical();
            setItemsSizesVertical();
        }
        layout.addView(textTitle);
        layout.addView(editUserName);
        layout.addView(editPassword);
    }
    private void setItemsConfig(){
        /*
        textTitle.setText(text_Title);
        textTitle.setTextSize(72);
        textTitle.setGravity(Gravity.CENTER);
        //textTitle.setBackgroundColor(Color.CYAN);

        //editUserName.setBackgroundColor(Color.GREEN);
        editUserName.setHint(userNameHint);
        editUserName.setTextSize(24);

        //editPassword.setBackgroundColor(Color.YELLOW);
        editPassword.setHint(passwordHint);
        editPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editPassword.setTextSize(24);

        checkRemember.setText(text_CheckBox);
        checkRemember.setGravity(Gravity.CENTER);

        buttonLogin.setText(text_logIn);
        buttonLogin.setTextSize(20);
        buttonRegister.setText(text_register);
        buttonRegister.setTextSize(20);

        textNoAccount.setText(text_no_account);
        textNoAccount.setTextSize(18);

        textTitle.setGravity(Gravity.CENTER);
        textNoAccount.setGravity(Gravity.CENTER);
        */
    }
    private void setItemsXVertical(){
/*
        textTitle.setX(width*titleX_V);
        editUserName.setX(width*editX_V);
        editPassword.setX(width*editX_V);
        checkRemember.setX(width*checkBoxX_V);
        buttonLogin.setX(width*buttonX_V);
        textNoAccount.setX(width*textNoAccountX_V);
        buttonRegister.setX(width*buttonX_V);
        */
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
    private void setItemsYVertical(){
        /*
        totalY = 0;
        totalY+=(initialY_V*height);
        setY(textTitle,titleHeight_V*height);
        totalY+=(space5p_V*height);
        setY(editUserName,height*editHeight_V);
        totalY+=(space1p_V*height);
        setY(editPassword,height*editHeight_V);
        totalY+=(space1p_V*height);
        totalY+=(space1p_V*height);
        setY(checkRemember,checkBoxHeight_V*height);
        setY(buttonLogin,buttonHeight_V*height);
        totalY+=(space1p_V*height);
        totalY+=(space1p_V*height);
        totalY+=(space1p_V*height);
        totalY+=(space1p_V*height);
        setY(textNoAccount,texNoCountHeight_V*height);
        setY(buttonRegister,buttonHeight_V*height);
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
    private void setItemsSizesHorizontal(){
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
    private void setItemsSizesVertical(){
        /*
        textTitle.setWidth((int)(width*titleWidth_V));
        textTitle.setHeight((int)(height*titleHeight_V));

        editUserName.setWidth((int)(width*editWidth_V));
        editUserName.setHeight((int)(height*editHeight_V));

        editPassword.setWidth((int)(width*editWidth_V));
        editPassword.setHeight((int)(height*editHeight_V));

        checkRemember.setWidth((int)(checkBoxWidth_V*width));
        checkRemember.setHeight((int)(checkBoxHeight_V*height));

        buttonLogin.setWidth((int)(buttonWidth_V*width));
        buttonLogin.setHeight((int)(buttonHeight_V*height));

        textNoAccount.setWidth((int)(textNoAccountWidth_V*width));
        textNoAccount.setHeight((int)(texNoCountHeight_V*height));

        buttonRegister.setWidth((int)(buttonWidth_V*width));
        buttonRegister.setHeight((int)(buttonHeight_V*height));
        */
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
