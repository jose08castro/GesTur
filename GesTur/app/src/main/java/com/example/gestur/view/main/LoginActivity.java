package com.example.gestur.view.main;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.Gravity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gestur.DB.DB;
import com.example.gestur.R;
import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.logic.forms.CafeteriaFondaSodaForm;
import com.example.gestur.logic.forms.ConCentersBinaryForm;
import com.example.gestur.logic.forms.RestaurantBinaryForm;
import com.example.gestur.logic.forms.ScoreForm;
import com.example.gestur.logic.forms.SpaForm;
import com.example.gestur.view.InfoPasser;
import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LoginActivity extends AbstractActivity implements ILoginActivityConstants, IObservable {

    private TextView textTitle;
    private EditText editUserName;
    private EditText editPassword;
    private CheckBox checkRemember;
    private Button buttonLogin;
    private TextView textNoAccount;
    private Button buttonRegister;
    private SignInButton buttonGoogle;

    private List<AuthUI.IdpConfig> providers;
    private int MY_REQUEST_CODE = 7117;

    private DatabaseReference myRef;
    private FirebaseDatabase mFirebaseDatabase;

    public GoogleApiClient mGoogleApiClient;
    private static final int RC_SIGN_IN = 9001;

    AlphaAnimation inAnimation;
    AlphaAnimation outAnimation;

    FrameLayout progressBarHolder;

    private boolean DBanswered;

    private IObservable observable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        observable = this;
        DBanswered = false;
        progressBarHolder = (FrameLayout) findViewById(R.id.progressBarHolder);

        providers = Arrays.asList(new AuthUI.IdpConfig.EmailBuilder().build());
        findItems();
        setItemsConfiguration();
        setItemsBounds();
        addItems();

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //DB.getInstance().logIn("josueggss73","12345678",observable);
                validateSignIn();

            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context, RegisterUserActivity.class));
            }
        });
        setGoogleSignInReqs();
        DB.getInstance().logIn("josueggss73","12345678",observable);
        //DB.getInstance().setFormDefinitions();
        //DB.getInstance().setCheckListDefinitions();
    }
    private class MyTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            inAnimation = new AlphaAnimation(0f, 0f);
            inAnimation.setDuration(200);
            progressBarHolder.setAnimation(inAnimation);
            progressBarHolder.setVisibility(View.VISIBLE);
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            outAnimation = new AlphaAnimation(0f, 0f);
            outAnimation.setDuration(200);
            progressBarHolder.setAnimation(outAnimation);
            progressBarHolder.setVisibility(View.GONE);
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                while(!DBanswered){
                    TimeUnit.MILLISECONDS.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    private void validateSignIn(){
        String user = editUserName.getText().toString().trim();
        String pass = editPassword.getText().toString().trim();
        if(!user.isEmpty() & pass.length()>=8){
            setItemsEnabled(false);
            DBanswered = false;
            new MyTask().execute();
            DB.getInstance().logIn(user,pass,this);
        }else {
            Toast.makeText(this, "Datos de ingreso incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
    @Override// 1 para exito, 2 para error
    public void notifyObservable(int n,String msg) {
        DBanswered = true;
        if(n == 1){
            setItemsEnabled(true);
            startActivity(new Intent(context, LobbyActivity.class));
            Toast.makeText(this, "DATOS CORRECTOS, BIENVENIDO", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Datos de ingreso incorrectos", Toast.LENGTH_SHORT).show();
        }
    }

    private void setGoogleSignInReqs(){
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        mGoogleApiClient = new GoogleApiClient.Builder(this).enableAutoManage(this, new GoogleApiClient.OnConnectionFailedListener() {
            @Override
            public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

            }
        }).addApi(Auth.GOOGLE_SIGN_IN_API,gso).build();

        buttonGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
                startActivityForResult(signInIntent,RC_SIGN_IN);
            }
        });
    }
    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == RC_SIGN_IN){
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleSignInResult(result);
        }
    }
    private void handleSignInResult(GoogleSignInResult result){
        if(result.isSuccess()){
            GoogleSignInAccount acct = result.getSignInAccount();
            //textNoAccount.setText(acct.getEmail());
        }
    }

    private void addData1(DataSnapshot dataSnapshot) {
        Map<String, Object> objectMap = (HashMap<String, Object>)dataSnapshot.getValue();
        //List<FormDefinition> list= new ArrayList<FormDefinition>();
        //List<ChapterDefinition> list2= new ArrayList<ChapterDefinition>();
        //List<QuestionDefinition> list3= new ArrayList<QuestionDefinition>();
        String result = "";
        for(Object obj : objectMap.values()) {
            if (obj instanceof Map) {
                Map<String, Object> mapObj = (Map<String, Object>) obj;
                //FormDefinition match = new FormDefinition();
                //match.setName((String) mapObj.get("name"));
                long number = (Long) mapObj.get("number");
                //match.setNumber((int) number);
                //result += match.name +"\n";
                //result += match.number +"\n";
                Map<String,Object> chapters = (HashMap<String, Object>) mapObj.get("chapters");
                for(Object obj2:chapters.values()){
                    Map<String, Object> mapObj2 = (Map<String, Object>) obj2;
                    //ChapterDefinition chapterDef = new ChapterDefinition();
                    //chapterDef.setName((String) mapObj2.get("name"));
                    long number2 = (Long) mapObj2.get("num");
                    //chapterDef.setNum((int) number2);
                    //result +="  " +chapterDef.name +"\n";
                    //result +="  " +String.valueOf(chapterDef.num) +"\n";
                    Map<String,Object> questions = (HashMap<String, Object>) mapObj2.get("questions");
                    for(Object obj3:questions.values()){
                        Map<String, Object> mapObj3 = (Map<String, Object>) obj3;
                      //  QuestionDefinition questionDef = new QuestionDefinition();
                      //  questionDef.setQuestion((String) mapObj3.get("question"));
                        //result +="     " +questionDef.question +"\n";
                        //list3.add(questionDef);
                    }
                    //list2.add(chapterDef);
                }
               // list.add(match);
            }
            //display all the information
            textTitle.setTextSize(18);
            //textTitle.setText("Nombre: "+list.get(0).getName() +" Numero: "+list.get(0).getNumber());
            textTitle.setText(result);
            /* FOR FUTURE XML
             <android.support.design.widget.TextInputLayout
        android:id="@+id/text_input_email"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:errorEnabled="true">

        <android.support.design.widget.TextInputEditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Email"
            android:inputType="textEmailAddress" />

    </android.support.design.widget.TextInputLayout>




    <android.support.design.widget.TextInputLayout
        android:id="@+id/text_input_username"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:counterEnabled="true"
        app:counterMaxLength="15"
        app:errorEnabled="true">

        <android.support.design.widget.TextInputEditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Username"
            android:inputType="text" />

    </android.support.design.widget.TextInputLayout>

    <android.support.design.widget.TextInputLayout
        android:id="@+id/text_input_password"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:errorEnabled="true"
        app:passwordToggleEnabled="true">

        <android.support.design.widget.TextInputEditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Password"
            android:inputType="textPassword" />

    </android.support.design.widget.TextInputLayout>
             */
        }

    }

    @Override
    protected void setItemsBoundsHorizontal() {
        setBounds(textTitle,titleWidth_H,titleHeight_H,0);
        setBounds(textNoAccount,textNoAccountWidth_H,texNoCountHeight_H,textNoAccountX_H);
        addSpace(2,100);
        setBounds(buttonRegister,buttonWidth_H,buttonHeight_H,buttonR_H);
        totalY=(int)(initialY_H*height);
        setBounds(editUserName,editWidth_H,editHeight_H,editX_H);
        addSpace(2,100);
        setBounds(editPassword,editWidth_H,editHeight_H,editX_H);
        addSpace(8,100);
        setBounds(checkRemember,checkBoxWidth_H,checkBoxHeight_H,checkBoxX_H);
        addSpace(2,100);
        setBounds(buttonLogin,buttonWidth_H,buttonHeight_H,buttonL_H);
    }
    @Override
    protected void setItemsBoundsVertical() {
        setBounds(textTitle,1,titleHeight_V,0);
        addSpace(5,100);
        setBounds(editUserName,editWidth_V,editHeight_V,editX_V);
        addSpace(1,100);
        setBounds(editPassword,editWidth_V,editHeight_V,editX_V);
        addSpace(12,100);
        setBounds(checkRemember,checkBoxWidth_V,checkBoxHeight_V,checkBoxX_V);
        setBounds(buttonLogin,buttonWidth_V,buttonHeight_V,buttonX_V);
        //setSignInButtonBounds(buttonGoogle,buttonWidth_V,buttonHeight_V,buttonX_V);
        addSpace(4,100);
        setBounds(textNoAccount,textNoAccountWidth_V,texNoCountHeight_V,textNoAccountX_V);
        setBounds(buttonRegister,buttonWidth_V,buttonHeight_V,buttonX_V);
    }
    protected void setSignInButtonBounds(SignInButton view, float w, float h, float x){
        view.setMinimumWidth((int)(w*width));
        view.setMinimumHeight((int)(h*height));
        view.setX(x*width);
        view.setY(totalY);
        totalY+=((int)(h*height));
    }
    @Override
    protected void setItemsConfiguration(){
        textTitle.setText(text_Title);

        textTitle.setTextSize(getTextSize(15));
        textTitle.setGravity(Gravity.CENTER);

        editUserName.setHint(userNameHint);
        editUserName.setTextSize(getTextSize(40));

        editPassword.setHint(passwordHint);
        editPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editPassword.setTextSize(getTextSize(40));

        checkRemember.setText(text_CheckBox);
        checkRemember.setTextSize(getTextSize(60));
        checkRemember.setGravity(Gravity.CENTER);

        buttonLogin.setText(text_logIn);
        buttonLogin.setTextSize(getTextSize(50));
        buttonRegister.setText(text_register);
        buttonRegister.setTextSize(getTextSize(50));

        textNoAccount.setText(text_no_account);
        textNoAccount.setTextSize(getTextSize(55));

        textTitle.setGravity(Gravity.CENTER);
        textNoAccount.setGravity(Gravity.CENTER);

    }

    private void setItemsEnabled(boolean enabled){
        editUserName.setEnabled(enabled);
        editPassword.setEnabled(enabled);
        checkRemember.setEnabled(enabled);
        buttonRegister.setEnabled(enabled);
        buttonGoogle.setEnabled(enabled);
        buttonLogin.setEnabled(enabled);
    }

    private void addItems(){
        layout.addView(textTitle);
        layout.addView(editUserName);
        layout.addView(editPassword);
        layout.addView(checkRemember);
        layout.addView(buttonLogin);
        layout.addView(textNoAccount);
        layout.addView(buttonRegister);
        //layout.addView(buttonGoogle);
    }

    private void findItems(){
        textTitle = new TextView(this);
        editUserName = new EditText(this);
        editPassword = new EditText(this);
        checkRemember = new CheckBox(this);
        buttonLogin = new Button(this);
        buttonGoogle = new SignInButton(this);
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
        ConCentersBinaryForm formCenters = new ConCentersBinaryForm(name7,1,"Centro Artes",1,1,1,null,null);
        BinaryForm formEnterprise = new BinaryForm(name8,1,null);
        RestaurantBinaryForm formRestaurant = new RestaurantBinaryForm(name9,1,"KFC","",0,0,0,null);
        CafeteriaFondaSodaForm formFondaSoda = new CafeteriaFondaSodaForm(name10,0,0,0,"Rio de Janeiro",1,null,"Soda");
        CafeteriaFondaSodaForm formCafeteria = new CafeteriaFondaSodaForm(name11,0,0,0,"Rio de Janeiro",1,null,"Cafeteria");
        BinaryForm formWaterActivities = new BinaryForm(name12,1,null);
        BinaryForm formAirActivities = new BinaryForm(name13,1,null);
        SpaForm formSpa = new SpaForm("Spa",0,"Montaña",0,name14,1,null);

        InfoPasser.getInstance().setCurrentForm(formTematics);
    }



    /*
    private void showSingIn(){
        startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder()
                .setAvailableProviders(providers)
                .setTheme(R.style.MyTheme)
                .build(),MY_REQUEST_CODE
        );
    }
    /*
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
    */
}
