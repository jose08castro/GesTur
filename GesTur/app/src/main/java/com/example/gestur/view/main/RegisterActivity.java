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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.gestur.R;

import java.util.ArrayList;

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
    private Spinner spinnerProvinces;
    private Spinner spinnerCantons;
    private Spinner spinnerDistricts;

    private TextView textAddress;
    private EditText editAddress;

    private Button buttonCreate;

    private ConstraintLayout layout;
    private TrackableScrollView scroll;
    private int totalY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        layout = findViewById(R.id.layoutRegister);
        scroll = findViewById(R.id.scrollRegister);
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
        setFocusListeners();
        layout.setMinHeight(totalY+100);

        //DB db = new DB();
        //db.registerUser("josueggss73@gmail.com","warrior73");

    }
    private void setFocusListeners(){
        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                scroll.setScrollingEnabled(true);
                editName.clearFocus();
                spinnerCategories.clearFocus();
                spinnerProvinces.clearFocus();
                spinnerCantons.clearFocus();
                spinnerDistricts.clearFocus();
                editAddress.clearFocus();
                //editPhone.clearFocus();
                return false;
            }
        });
        spinnerProvinces.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                loadSpinnerCantons();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinnerCantons.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                loadSpinnerDistricts();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        editName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    scroll.scrollTo(0, (int) textName.getY());
                    scroll.setScrollingEnabled(false);
                }else{
                    scroll.setScrollingEnabled(true);
                }
            }
        });
        editAddress.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    scroll.scrollTo(0, (int) textAddress.getY());
                    scroll.setScrollingEnabled(false);
                }else{
                    scroll.setScrollingEnabled(true);
                }
            }
        });
        spinnerCategories.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    scroll.scrollTo(0, (int) textCategory.getY());
                    scroll.setScrollingEnabled(false);
                }else{
                    scroll.setScrollingEnabled(true);
                }
            }
        });
        spinnerProvinces.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    scroll.scrollTo(0, (int) textProvince.getY());
                    scroll.setScrollingEnabled(false);
                }else{
                    scroll.setScrollingEnabled(true);
                }
            }
        });
        spinnerCantons.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    scroll.scrollTo(0, (int) textCanton.getY());
                    scroll.setScrollingEnabled(false);
                }else{
                    scroll.setScrollingEnabled(true);
                }
            }
        });
        spinnerDistricts.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b){
                    scroll.scrollTo(0, (int) textDistrict.getY());
                    scroll.setScrollingEnabled(false);
                }else{
                    scroll.setScrollingEnabled(true);
                }
            }
        });
        buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //attemptRegister;
            }
        });
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
        spinnerProvinces = new Spinner(this);
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

        textName.setText(text_name);
        textName.setTextSize(20);

        editName.setTextSize(20);

        textCategory.setText(text_category);
        textCategory.setTextSize(20);

        loadSpinnerCategories();

        textOperative.setText(text_operative);
        textOperative.setTextSize(20);

        textLocation.setText(text_location);
        textLocation.setTextSize(20);
        textLocation.setGravity(Gravity.CENTER);

        textProvince.setText(text_province);
        textProvince.setTextSize(20);

        loadSpinnerProvinces();

        textCanton.setText(text_canton);
        textCanton.setTextSize(20);

        loadSpinnerCantons();

        textDistrict.setText(text_district);
        textDistrict.setTextSize(20);

        loadSpinnerDistricts();

        textAddress.setText(text_address);
        textAddress.setTextSize(20);

        editAddress.setTextSize(20);

        buttonCreate.setText(text_button);
        buttonCreate.setTextSize(22);

    }
    private void setItemsSizesVertical(){
        textTitle.setWidth((int)(width*titleWidth_V));
        textTitle.setHeight((int)(height*titleHeight_V));

        textActivityRegister.setWidth((int)(width*title_register_width_V));
        textActivityRegister.setHeight((int)(title_register_height_V*height));

        textName.setWidth((int)(width*text_Width_V));
        textName.setHeight((int)(height*text_height));

        editName.setWidth((int)(width*edit_TextWidth_V));
        editName.setHeight((int)(height*editHeight_V));

        textCategory.setWidth((int)(width*text_Width_V));
        textCategory.setHeight((int)(height*text_height));

        spinnerCategories.setMinimumWidth((int)(width*spinnerWidth_V));
        spinnerCategories.setMinimumHeight((int)(height*editHeight_V));

        textOperative.setWidth((int)(width*text_operativeWidth_V));
        textOperative.setHeight((int)(height*text_height));

        checkOperative.setWidth((int)(width*check_OperativeWidth_V));
        checkOperative.setHeight((int)(height*text_height));

        textLocation.setWidth((int)(width*text_Width_V));
        textLocation.setHeight((int)(height*text_height));

        textProvince.setWidth((int)(width*text_Width_V));
        textProvince.setHeight((int)(height*text_height));

        spinnerProvinces.setMinimumWidth((int)(width*spinnerWidth_V));
        spinnerProvinces.setMinimumHeight((int)(height*editHeight_V));

        textCanton.setWidth((int)(width*text_Width_V));
        textCanton.setHeight((int)(height*text_height));

        spinnerCantons.setMinimumWidth((int)(width*spinnerWidth_V));
        spinnerCantons.setMinimumHeight((int)(height*editHeight_V));

        textDistrict.setWidth((int)(width*text_Width_V));
        textDistrict.setHeight((int)(height*text_height));

        spinnerDistricts.setMinimumWidth((int)(width*spinnerWidth_V));
        spinnerDistricts.setMinimumHeight((int)(height*editHeight_V));

        textAddress.setWidth((int)(width*text_Width_V));
        textAddress.setHeight((int)(height*text_height));

        editAddress.setWidth((int)(width*edit_TextWidth_V));
        editAddress.setHeight((int)(height*editHeight_V));

        buttonCreate.setWidth((int)(width*buttonCreate_Width_V));
        buttonCreate.setHeight((int)(height*buttonCreate_Height_V));
    }
    private void setItemsXVertical(){
        textTitle.setX(width*titleX_V);
        textActivityRegister.setX(width*text_X_V);
        textName.setX(width*text_X_V);
        editName.setX(width*edit_TextX_V);
        textCategory.setX(width*text_X_V);
        spinnerCategories.setX(width*spinnerX_V);
        textOperative.setX(width*text_operativeX_V);
        checkOperative.setX(width*check_OperativeX_V);
        textLocation.setX(width*text_X_V);
        textProvince.setX(width*text_X_V);
        spinnerProvinces.setX(width*spinnerX_V);
        textCanton.setX(width*text_X_V);
        spinnerCantons.setX(width*spinnerX_V);
        textDistrict.setX(width*text_X_V);
        spinnerDistricts.setX(width*spinnerX_V);
        textAddress.setX(width*text_X_V);
        editAddress.setX(width*edit_TextX_V);
        buttonCreate.setX(width*buttonCreate_X_V);
    }
    private void setItemsYVertical(){

        totalY = 0;
        setY(textTitle,titleHeight_V*height);
        setY(textActivityRegister,title_register_height_V*height);
        totalY+=(space5p_V*height);
        setY(textName,height*text_height);
        setY(editName,height*editHeight_V);
        setY(textCategory,height*text_height);
        totalY+=(space1p_V*height);
        setY(spinnerCategories,height*editHeight_V);
        totalY+=(space1p_V*height);
        setY(textOperative,height*text_height);
        totalY-=((int)(height*text_height));
        setY(checkOperative,height*text_height);
        totalY+=(space1p_V*height);
        totalY+=(space1p_V*height);
        totalY+=(space1p_V*height);
        setY(textLocation,height*text_height);
        totalY+=(space1p_V*height);
        setY(textProvince,height*text_height);
        setY(spinnerProvinces,height*editHeight_V);
        setY(textCanton,height*text_height);
        setY(spinnerCantons,height*editHeight_V);
        setY(textDistrict,height*text_height);
        setY(spinnerDistricts,height*editHeight_V);
        setY(textAddress,height*text_height);
        setY(editAddress,height*editHeight_V);
        totalY+=(space1p_V*height);
        totalY+=(space1p_V*height);
        setY(buttonCreate,height*buttonCreate_Height_V);
    }
    private void addItems(){
        layout.addView(textTitle);
        layout.addView(textActivityRegister);
        layout.addView(textName);
        layout.addView(editName);
        layout.addView(textCategory);
        layout.addView(spinnerCategories);
        layout.addView(textOperative);
        layout.addView(checkOperative);
        layout.addView(textLocation);
        layout.addView(textProvince);
        layout.addView(spinnerProvinces);
        layout.addView(textCanton);
        layout.addView(spinnerCantons);
        layout.addView(textDistrict);
        layout.addView(spinnerDistricts);
        layout.addView(textAddress);
        layout.addView(editAddress);
        layout.addView(buttonCreate);
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
    private void loadSpinnerCategories(){
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Actividad Temática");
        strings.add("Hotel");
        strings.add("Agencia de viajes");
        strings.add("Alquiler de Automóviles,Cuadraciclos y Motocicletas");
        strings.add("Agencia de viajes");
        strings.add("Línea aérea");
        strings.add("Transporte Acuático y Tours");
        strings.add("Centro de Congresos y Convenciones");
        strings.add("Empresa dedicada a Centros y Convenciones");
        strings.add("Restaurante");
        strings.add("Fonda/Soda");
        strings.add("Cafetería");
        strings.add("Actividad Recreativa Acuática");
        strings.add("Actividad Recreativa Aérea");
        strings.add("Spa");
        spinnerCategories.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, strings));
    }

    private void loadSpinnerProvinces(){
        spinnerProvinces.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, LocationManager.getProvinces()));
        spinnerProvinces.setSelection(0);
    }
    private void loadSpinnerCantons(){
        spinnerCantons.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, LocationManager
                .getCantons((String)spinnerProvinces.getSelectedItem())));
        spinnerCantons.setSelection(0);
        loadSpinnerDistricts();
    }
    private void loadSpinnerDistricts(){
        spinnerDistricts.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, LocationManager
                .getDistricts((String)spinnerProvinces.getSelectedItem(),(String)spinnerCantons.getSelectedItem())));
        spinnerDistricts.setSelection(0);
    }
}
