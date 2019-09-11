package com.example.gestur.view.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.gestur.R;
import com.example.gestur.view.IRegisterActivityConstants;

public class RegisterActivity extends AppCompatActivity implements IRegisterActivityConstants {

    final Context context = this;
    private int width;
    private int height;

    private TextView textTitle;
    private TextView textActivityRegister;

    private TextView textName;
    private EditText editName;

    private TextView textCategory;
    private Spinner spinnerCategories;

    private TextView textOperative;
    private CheckBox checkOperative;

    private TextView textLocation;

    private TextView textProvince;
    private TextView textCanton;
    private TextView textDistrict;
    private Spinner spinnerProvices;
    private Spinner spinnerCantons;
    private Spinner spinnerDistricts;

    private TextView textAddress;
    private EditText editAddress;

    private Button buttonCreate;

    private ConstraintLayout layout;
    private int totalY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        layout = findViewById(R.id.layoutRegister);
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
        addItems();
        layout.setMinHeight(totalY+300);
        //DB db = new DB();
        //db.registerUser("josueggss73@gmail.com","warrior73");

    }
    private void createItems(){
        textTitle = new TextView(this);
        textActivityRegister = new TextView(this);
        textName = new TextView(this);
        editName = new EditText(this);
        textCategory = new TextView(this);
        spinnerCategories = new Spinner(this);
        textOperative = new TextView(this);
        checkOperative = new CheckBox(this);
        textLocation = new TextView(this);
        textProvince = new TextView(this);
        spinnerProvices = new Spinner(this);
        textCanton = new TextView(this);
        spinnerCantons = new Spinner(this);
        textDistrict = new TextView(this);
        spinnerDistricts = new Spinner(this);
        textAddress = new TextView(this);
        editAddress = new EditText(this);
        buttonCreate = new Button(this);
    }

    private void setItemsConfig(){

        textTitle.setText(text_title);
        textTitle.setTextSize(72);
        textTitle.setGravity(Gravity.CENTER);

        textActivityRegister.setText(text_activity_register);
        textActivityRegister.setTextSize(20);
        textActivityRegister.setGravity(Gravity.CENTER);

        //textName.setText(text_name);
        //textTitle.setTextSize(20);
        //textTitle.setGravity(Gravity.CENTER);



    }
    private void setItemsSizesVertical(){

        textTitle.setWidth((int)(width*titleWidth_V));
        textTitle.setHeight((int)(height*titleHeight_V));

        textActivityRegister.setWidth((int)(width*title_register_width_V));
        textActivityRegister.setHeight((int)(title_register_height_V*height));

        //textName.setWidth((int)(width*text_nameWidth_V));
        //textName.setHeight((int)(height*text_height));

    }
    private void setItemsXVertical(){
        textTitle.setX(width*titleX_V);
        textActivityRegister.setX(width*text_nameX_V);
        //textName.setX(width*text_nameX_V);
    }
    private void setItemsYVertical(){

        totalY = 0;
        setY(textTitle,titleHeight_V*height);
        setY(textActivityRegister,title_register_height_V*height);
        //totalY+=(space5p_V*height);
        //setY(textName,height*text_height);
        //totalY+=(space5p_V*height);
        //setY(editUserName,height*editHeight_V);
        //totalY+=(space1p_V*height);
        //setY(editPassword,height*editHeight_V);
        //totalY+=(space1p_V*height);
        //totalY+=(space1p_V*height);
        //setY(checkRemember,checkBoxHeight_V*height);
        //setY(buttonLogin,buttonHeight_V*height);
        //totalY+=(space1p_V*height);
        //totalY+=(space1p_V*height);
        //totalY+=(space1p_V*height);
        //totalY+=(space1p_V*height);
        //setY(textNoAccount,texNoCountHeight_V*height);
        //setY(buttonRegister,buttonHeight_V*height);

    }
    private void addItems(){
        layout.addView(textTitle);
        layout.addView(textActivityRegister);
        //layout.addView(textName);
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
