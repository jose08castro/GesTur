package com.example.gestur.view.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gestur.DB.DB;
import com.example.gestur.DB.FormDefFactory;
import com.example.gestur.R;
import com.example.gestur.logic.FormFactory;
import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.logic.forms.CafeteriaFondaSodaForm;
import com.example.gestur.logic.forms.ConCentersBinaryForm;
import com.example.gestur.logic.forms.RestaurantBinaryForm;
import com.example.gestur.logic.forms.ScoreForm;
import com.example.gestur.logic.forms.SpaForm;
import com.example.gestur.logic.questions.BinaryQuestion;
import com.example.gestur.view.InfoPasser;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginActivity extends AppCompatActivity implements ILoginActivityConstants {

    final Context context = this;
    private int width;
    private int height;

    private TextView textTitle;
    private EditText editUserName;
    private EditText editPassword;
    private CheckBox checkRemember;
    private Button buttonLogin;
    private TextView textNoAccount;
    private Button buttonRegister;

    private ConstraintLayout layout;
    private int totalY;

    private List<AuthUI.IdpConfig> providers;
    private int MY_REQUEST_CODE = 7117;

    private DatabaseReference myRef;
    private FirebaseDatabase mFirebaseDatabase;
    private static final String TAG = "Get--";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        providers = Arrays.asList(new AuthUI.IdpConfig.EmailBuilder().build());

        getScreenSizes();
        setData();
        findItems();
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
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //showSingIn();
                startActivity(new Intent(context, LobbyActivity.class));
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context, RegisterUserActivity.class));
            }
        });
        layout.addView(textTitle);
        layout.addView(editUserName);
        layout.addView(editPassword);
        layout.addView(checkRemember);
        layout.addView(buttonLogin);
        layout.addView(textNoAccount);
        layout.addView(buttonRegister);

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        myRef = mFirebaseDatabase.getReference("FormDefinition");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.d(TAG, "entro al onData");
                //addData1(dataSnapshot);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        DB db = new DB();
        db.setFormDefinitions();

        //final FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference usersRef = database.getReference("FormsDefinition/FormHotels");
        //Map<String, FormDefinition> forms = new HashMap<>();

        //FormDefinition form1 = new FormDefinition();
        //FormDefinition form2 = new FormDefinition();
        //FormDefinition form3 = new FormDefinition();
        //form1.name = "Prueba1";
        //form1.number = 1;
        //form2.name = "Prueba2";
        //form2.number = 2;
        //form3.name = "EstoFunciona3";
        //form3.number = 3;

        //forms.put("prueba1",form1);
        //forms.put("prueba2",form2);
        //forms.put("prueba3",form3);


        //usersRef.setValue(FormDefFactory.getFormHotelDef());//setValueAsync(forms);


        //DB db = new DB();
        //db.registerUser("josueggss73@gmail.com","warrior73");

        //FirebaseFirestore db = FirebaseFirestore.getInstance();
    }/*
    private void addData1(DataSnapshot dataSnapshot) {
        Map<String, Object> objectMap = (HashMap<String, Object>)dataSnapshot.getValue();
        List<FormDefinition> list= new ArrayList<FormDefinition>();
        List<ChapterDefinition> list2= new ArrayList<ChapterDefinition>();
        List<QuestionDefinition> list3= new ArrayList<QuestionDefinition>();
        String result = "";
        for(Object obj : objectMap.values()) {
            if (obj instanceof Map) {
                Map<String, Object> mapObj = (Map<String, Object>) obj;
                FormDefinition match = new FormDefinition();
                match.setName((String) mapObj.get("name"));
                long number = (Long) mapObj.get("number");
                match.setNumber((int) number);
                result += match.name +"\n";
                result += match.number +"\n";

                Map<String,Object> chapters = (HashMap<String, Object>) mapObj.get("chapters");

                for(Object obj2:chapters.values()){
                    Map<String, Object> mapObj2 = (Map<String, Object>) obj2;
                    ChapterDefinition chapterDef = new ChapterDefinition();

                    chapterDef.setName((String) mapObj2.get("name"));
                    long number2 = (Long) mapObj2.get("num");
                    chapterDef.setNum((int) number2);


                    result +="  " +chapterDef.name +"\n";
                    result +="  " +String.valueOf(chapterDef.num) +"\n";

                    Map<String,Object> questions = (HashMap<String, Object>) mapObj2.get("questions");
                    for(Object obj3:questions.values()){
                        Map<String, Object> mapObj3 = (Map<String, Object>) obj3;

                        QuestionDefinition questionDef = new QuestionDefinition();

                        questionDef.setQuestion((String) mapObj3.get("question"));

                        result +="     " +questionDef.question +"\n";

                        list3.add(questionDef);

                    }

                    list2.add(chapterDef);
                }

                list.add(match);
            }
            //display all the information
            textTitle.setTextSize(18);
            //textTitle.setText("Nombre: "+list.get(0).getName() +" Numero: "+list.get(0).getNumber());
            textTitle.setText(result);
            //Log.d(TAG, "NOMBRE FORM------------------"+list.get(0).getName());

            //Log.d(TAG, "showData: chapter: " + uInfo.getChapters().get(0).getName());
        }

    }*/
    private void setItemsConfig(){
        textTitle.setText(text_Title);

        textTitle.setTextSize((int)(width/15));
        textTitle.setGravity(Gravity.CENTER);
        textTitle.setBackgroundColor(Color.CYAN);


        editUserName.setBackgroundColor(Color.GREEN);
        editUserName.setHint(userNameHint);
        editUserName.setTextSize((int)(width/40));

        editPassword.setBackgroundColor(Color.YELLOW);
        editPassword.setHint(passwordHint);
        editPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editPassword.setTextSize((int)(width/40));

        checkRemember.setText(text_CheckBox);
        checkRemember.setTextSize((int)(width/60));
        checkRemember.setGravity(Gravity.CENTER);

        buttonLogin.setText(text_logIn);
        buttonLogin.setTextSize((int)(width/50));
        buttonRegister.setText(text_register);
        buttonRegister.setTextSize((int)(width/50));

        textNoAccount.setText(text_no_account);
        textNoAccount.setTextSize((int)(width/55));

        textTitle.setGravity(Gravity.CENTER);
        textNoAccount.setGravity(Gravity.CENTER);
    }
    private void setItemsXVertical(){

        textTitle.setX(0);
        editUserName.setX(width*editX_V);
        editPassword.setX(width*editX_V);
        checkRemember.setX(width*checkBoxX_V);
        buttonLogin.setX(width*buttonX_V);
        textNoAccount.setX(width*textNoAccountX_V);
        buttonRegister.setX(width*buttonX_V);
    }
    private void setItemsXHorizontal(){

        //textTitle.setX(width*titleX_H);
        textTitle.setX(0);
        editUserName.setX(width*editX_H);
        editPassword.setX(width*editX_H);
        checkRemember.setX(width*checkBoxX_H);
        buttonLogin.setX(width*buttonL_H);
        textNoAccount.setX(width*textNoAccountX_H);
        buttonRegister.setX(width*buttonR_H);
    }
    private void setItemsYVertical(){
        totalY = 0;
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
    }
    private void setItemsYHorizontal(){
        totalY = 0;
        setY(textTitle,titleHeight_H*height);
        /*setY(textNoAccount,texNoCountHeight_H*height);
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
        setY(buttonLogin,buttonHeight_H*height);*/
    }
    private void setItemsSizesHorizontal(){
        //textTitle.setWidth((int)(width*titleWidth_H));
        textTitle.setWidth((width));
        //textTitle.setHeight((int)(height*titleHeight_H));
        textTitle.setHeight(1500);
/*
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
        buttonRegister.setHeight((int)(buttonHeight_H*height));*/
    }
    private void setItemsSizesVertical(){
        textTitle.setWidth(width);
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
    }
    private void findItems(){
        textTitle = new TextView(this);
        editUserName = new EditText(this);
        editPassword = new EditText(this);
        checkRemember = new CheckBox(this);
        buttonLogin = new Button(this);
        textNoAccount = new TextView(this);
        buttonRegister = new Button(this);
        layout = findViewById(R.id.layoutLogin);
    }
    private void setData(){
        String name1 = "CALIFICACION DE ACTIVIDADES TURISTICAS TEMATICAS";
        String name2 = "MANUAL DE HOTELES";
        String name3 = "CALIFICACION PARA AGENCIAS DE VIAJES";
        String name4 = "CALIFICACION PARA ALQUILER DE AUTOMOVILES,CUADRACICLOS,MOTOCICLETAS";
        String name5 = "CALIFICACION PARA LINEAS AEREAS";
        String name6 = "CALIFICACION PARA TRANSPORTE ACUATICO Y TOURS";
        String name7 = "CALIFICACION DE CENTROS DE CONGRESOS Y CONVENCIONES";
        String name8 = "Calificación Empresa Organizadora de Congresos y Convenciones";
        String name9 = "Calificación de Restaurantes";
        String name10 = "Calificación para Fondas y Sodas ";
        String name11 = "Calificación para Cafeterías";
        String name12 = "Calificación para Actividades Recreativas Acuáticas";
        String name13 = "Calificación Actividades Recreativas Aéreas";
        String name14 = "Calificación de Spa";

        BinaryForm formTematics = new BinaryForm(name1,1,null);
        ScoreForm  formHotels = new ScoreForm(name2,1,null);
        BinaryForm formTravelAgencies = new BinaryForm(name3,1,null);
        BinaryForm formRentVehicules = new BinaryForm(name4,1,null);
        BinaryForm formAirLines = new BinaryForm(name5,1,null);
        BinaryForm formWaterTransport = new BinaryForm(name6,1,null);
        ConCentersBinaryForm formCenters = new ConCentersBinaryForm(name7,1,"Centro Artes",1,1,1,null);
        BinaryForm formEnterprise = new BinaryForm(name8,1,null);
        RestaurantBinaryForm formRestaurant = new RestaurantBinaryForm(name9,1,"KFC","",0,0,0,null);
        CafeteriaFondaSodaForm formFondaSoda = new CafeteriaFondaSodaForm(name10,0,0,0,"Rio de Janeiro",1,null,"Soda");
        CafeteriaFondaSodaForm formCafeteria = new CafeteriaFondaSodaForm(name11,0,0,0,"Rio de Janeiro",1,null,"Cafeteria");
        BinaryForm formWaterActivities = new BinaryForm(name12,1,null);
        BinaryForm formAirActivities = new BinaryForm(name13,1,null);
        SpaForm formSpa = new SpaForm("Spa",0,"Montaña",0,name14,1,null);

        InfoPasser.getInstance().setCurrentForm(formTematics);
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
    private void showSingIn(){
        startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder()
                .setAvailableProviders(providers)
                .setTheme(R.style.MyTheme)
                .build(),MY_REQUEST_CODE
        );
    }
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == MY_REQUEST_CODE){
            IdpResponse response = IdpResponse.fromResultIntent(data);
            if(resultCode==RESULT_OK){
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

                startActivity(new Intent(context, LobbyActivity.class));
            }
            else{
                Toast.makeText(this,22+response.getError().getMessage(),Toast.LENGTH_SHORT).show();
            }

        }
    }
}
