package com.example.gestur.view.main;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.os.Bundle;
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
import android.widget.Toast;

import com.example.gestur.DB.DB;
import com.example.gestur.R;

import java.util.ArrayList;

public class RegisterActivity extends AbstractActivity implements IObservable, IRegisterActivityConstants {

    final Context context = this;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        layout = findViewById(R.id.layoutRegister);
        scroll = findViewById(R.id.scrollRegister);
        createItems();
        setItemsConfiguration();
        setItemsBounds();
        setFocusListeners();
        addItems();

        layout.setMinHeight(totalY+100);

        buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateData();
            }
        });

    }
    private boolean validateData(){
        String activityName = editName.getText().toString().trim();
        String category = spinnerCategories.getSelectedItem().toString().trim();
        boolean operative = checkOperative.isSelected();
        String province = spinnerProvinces.getSelectedItem().toString().trim();
        String canton = spinnerCantons.getSelectedItem().toString().trim();
        String district = spinnerDistricts.getSelectedItem().toString().trim();
        String address = editAddress.getText().toString().trim();

        if(!activityName.isEmpty() & !address.isEmpty()){
            //Empezar con la mierda que da vueltas
            DB.getInstance().addActivity(activityName,getActivityType(category),getCheckListType(category),operative,province,canton,district,address,this);
        }else{
            Toast.makeText(this, "Ningún campo puede quedar vacío", Toast.LENGTH_SHORT).show();
        }


        return true;
    }
    @Override// 1 para exito, 2 para error, 3 para task successful
    public void notifyObservable(int n, String msg) {
        if(n == 1){
            Toast.makeText(this, "EXITO: "+msg, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(context, LobbyActivity.class));
        }
        if(n == 3){
            Toast.makeText(this, "Funcionó: "+msg, Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "ERROR: "+msg, Toast.LENGTH_SHORT).show();
        }
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


    @Override
    protected void setItemsBoundsHorizontal() {

    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(textTitle,titleWidth_V,titleHeight_V,titleX_V);
        setBounds(textActivityRegister,title_register_width_V,title_register_height_V,text_X_V);

        addSpace(5,100);

        setBounds(textName,text_Width_V,text_height,text_X_V);
        setBounds(editName,edit_TextWidth_V,editHeight_V,edit_TextX_V);
        setBounds(textCategory,text_Width_V,text_height,text_X_V);

        addSpace(1,100);
        setSpinnerBounds(spinnerCategories,spinnerWidth_V,editHeight_V,spinnerX_V);
        addSpace(1,100);

        setBounds(textOperative,text_operativeWidth_V,text_height,text_X_V);
        totalY-=((int)(height*text_height));
        setBounds(checkOperative,check_OperativeWidth_V,text_height,check_OperativeX_V);

        addSpace(3,100);
        setBounds(textLocation,text_Width_V,text_height,text_X_V);

        addSpace(1,100);
        setBounds(textProvince,text_Width_V,text_height,text_X_V);
        setSpinnerBounds(spinnerProvinces,spinnerWidth_V,editHeight_V,spinnerX_V);

        setBounds(textCanton,text_Width_V,text_height,text_X_V);
        setSpinnerBounds(spinnerCantons,spinnerWidth_V,editHeight_V,spinnerX_V);

        setBounds(textDistrict,text_Width_V,text_height,text_X_V);
        setSpinnerBounds(spinnerDistricts,spinnerWidth_V,editHeight_V,spinnerX_V);

        setBounds(textAddress,text_Width_V,text_height,text_X_V);
        setBounds(editAddress,edit_TextWidth_V,editHeight_V,edit_TextX_V);

        addSpace(2,100);
        setBounds(buttonCreate,buttonCreate_Width_V,buttonCreate_Height_V,buttonCreate_X_V);


    }

    @Override
    protected void setItemsConfiguration() {

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


    private void loadSpinnerCategories(){
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Actividad Temática");
        strings.add("Hotel");
        strings.add("Agencia de viajes");
        strings.add("Alquiler de Automóviles,Cuadraciclos y Motocicletas");
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
    private int getCheckListType(String type){
        switch (type){
            case "Actividad Temática":
                return 1;
            case "Hotel":
                return 1;
            case "Agencia de viajes":
                return 3;
            case "Alquiler de Automóviles,Cuadraciclos y Motocicletas":
                return 4;
            case "Línea aérea":
                return 5;
            case "Transporte Acuático y Tours":
                return 6;
            case "Centro de Congresos y Convenciones":
                return 7;
            case "Empresa dedicada a Centros y Convenciones":
                return 7;
            case "Restaurante":
                return 8;
            case "Fonda/Soda":
                return 8;
            case "Cafetería":
                return 8;
            case "Actividad Recreativa Acuática":
                return 9;
            case "Actividad Recreativa Aérea":
                return 10;
            case "Spa":
                return 11;
            default:
                return 0;
        }
    }
    private int getActivityType(String type){
        switch (type){
            case "Actividad Temática":
                return 1;
            case "Hotel":
                return 2;
            case "Agencia de viajes":
                return 3;
            case "Alquiler de Automóviles,Cuadraciclos y Motocicletas":
                return 4;
            case "Línea aérea":
                return 5;
            case "Transporte Acuático y Tours":
                return 6;
            case "Centro de Congresos y Convenciones":
                return 7;
            case "Empresa dedicada a Centros y Convenciones":
                return 8;
            case "Restaurante":
                return 9;
            case "Fonda/Soda":
                return 10;
            case "Cafetería":
                return 11;
            case "Actividad Recreativa Acuática":
                return 12;
            case "Actividad Recreativa Aérea":
                return 13;
            case "Spa":
                return 14;
            default:
                return 0;
        }
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
