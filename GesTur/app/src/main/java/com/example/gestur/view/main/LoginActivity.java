package com.example.gestur.view.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gestur.R;
import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.logic.forms.CafeteriaFondaSodaForm;
import com.example.gestur.logic.forms.RestaurantBinaryForm;
import com.example.gestur.logic.forms.ScoreForm;
import com.example.gestur.logic.forms.SpaForm;
import com.example.gestur.logic.questions.BinaryQuestion;
import com.example.gestur.logic.forms.ConCentersBinaryForm;
import com.example.gestur.view.InfoPasser;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

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
        //layout.addView(editUserName);
        //layout.addView(editPassword);
        layout.addView(checkRemember);
        layout.addView(buttonLogin);
        layout.addView(textNoAccount);
        layout.addView(buttonRegister);


        //DB db = new DB();
        //db.registerUser("josueggss73@gmail.com","warrior73");

        //FirebaseFirestore db = FirebaseFirestore.getInstance();
    }
    private void setItemsConfig(){
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
    }
    private void setItemsXVertical(){

        textTitle.setX(width*titleX_V);
        editUserName.setX(width*editX_V);
        editPassword.setX(width*editX_V);
        checkRemember.setX(width*checkBoxX_V);
        buttonLogin.setX(width*buttonX_V);
        textNoAccount.setX(width*textNoAccountX_V);
        buttonRegister.setX(width*buttonX_V);
    }
    private void setItemsXHorizontal(){

        textTitle.setX(width*titleX_H);
        editUserName.setX(width*editX_H);
        editPassword.setX(width*editX_H);
        checkRemember.setX(width*checkBoxX_H);
        buttonLogin.setX(width*buttonL_H);
        textNoAccount.setX(width*textNoAccountX_H);
        buttonRegister.setX(width*buttonR_H);
    }
    private void setItemsYVertical(){
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
    }
    private void setItemsYHorizontal(){
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
    }
    private void setItemsSizesHorizontal(){
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
    }
    private void setItemsSizesVertical(){
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
        /*ScoreForm  formHotels = new ScoreForm(name2,1,null);
        BinaryForm formTravelAgencies = new BinaryForm(name3,1,null);
        BinaryForm formRentVehicules = new BinaryForm(name4,1,null);
        BinaryForm formAirLines = new BinaryForm(name5,1,null);
        BinaryForm formWaterTransport = new BinaryForm(name6,1,null);
        ConCentersBinaryForm formCenters = new ConCentersBinaryForm(name7,1,"Centro Artes",1,1,1,null);
        BinaryForm formEnterprise = new BinaryForm(name8,1,null);
        RestaurantBinaryForm formRestaurant = new RestaurantBinaryForm(name9,1,"KFC","",0,0,0,null);
        CafeteriaFondaSodaForm formSoda = new CafeteriaFondaSodaForm(name10,0,0,0,"Rio de Janeiro",1,null,"Soda");
        CafeteriaFondaSodaForm formCafeteria = new CafeteriaFondaSodaForm(name11,0,0,0,"Rio de Janeiro",1,null,"Cafeteria");
        BinaryForm formWaterActivities = new BinaryForm(name12,1,null);
        BinaryForm formAirActivities = new BinaryForm(name13,1,null);
        SpaForm formSpa = new SpaForm("Spa",0,"Montaña",0,name14,1,null);
*/
        BinaryChapter binaryChapter1 = new BinaryChapter("Capitulo I: De la Organizacion","I",null,17);
        BinaryChapter binaryChapter2 = new BinaryChapter("Capitulo II: De la Operacion","II",null,39);
        BinaryChapter binaryChapter3 = new BinaryChapter("Capitulo III: De la Variables Ambientales y Culturales","III",null,20);
        BinaryChapter binaryChapter4 = new BinaryChapter("Capitulo IV: De la Organizacion","IV",null,14);

        String pregunta1 = "Cumple con las regulaciones para su operación establecidas por el Ministerio de Salud.";
        String pregunta2 = "Cumple con las Regulaciones para su operación establecidas por la Municipalidad local.                                                 \n";
        String pregunta3 = "En caso de ofrecer los servicios de hospedaje se encuentra debidamente inscrito ante las autoridades locales.";
        String pregunta4 = "La empresa dispone de un Seguro de Responsabilidad Civil y gastos médicos.";
        String pregunta5 = "Cuando se involucran actividades de Turismo de Aventura las mismas se apegan a lo establecido por el Ministerio de Salud.";
        String pregunta6 = "La empresa dispone de una bitácora de Mantenimiento";
        String pregunta7 = "La empresa dispone de un Manual de Seguridad";
        String pregunta8 = "Los Guías tienen el certificado de Primeros Auxilios y RCP";
        String pregunta9 = "Se dispone de Guías para atender a los turistas tanto en forma individual o grupal";
        String pregunta10 = "La empresa dispone de un Reglamento Interno de Operación para el desarrollo de sus visitas.";

        String pregunta11 = "Considera un aspecto temático  como eje principal  de su Actividad Turística. \n";
        String pregunta12 = "En lo que respecta a su ubicación el proyecto se encuentra rodeado de atractivos turísticos tanto naturales como culturales de importancia.\n";
        String pregunta13 = "Se cuenta con  Disposiciones Generales de Información y Seguridad al Turista.\n";
        String pregunta14 = "\"Se cuenta con una sala  para la recepción del turista individual o en grupo, \n" +
                "donde se le proporcionan servicios varios y de información general.                                   \"\n";
        String pregunta15 = "Todos los servicios y accesos a las actividades  se encuentran  señalados.                   \n";
        String pregunta16 = "En caso de contar con un restaurante, su planta física  se encuentra en buen estado de mantenimiento y limpieza.\n";
        String pregunta17 = "Se dispone de una carta de menú, donde se detalla la composición de los platos y precios con los impuestos de ley.\n";
        String pregunta18 = "Las mesas y sillas del salón se encuentran en buen estado de mantenimiento y limpieza. \n";
        String pregunta19 = "En caso de contar con kioskos o sodas para el consumo de alimentos y bebidas estos se encuentran en buen estado de mantenimiento y limpieza.\n";
        String pregunta20 = "El mobiliario de los kioskos o sodas se encuentran en buen estado de mantenimiento y limpieza.\n";
        String pregunta21 = "La empresa dispone de equipo de comunicación portátil entre  los guías con la base de operaciones.\n";
        String pregunta22 = "La empresa dispone de equipo especializado para el desarrollo de sus programas (Caminatas, Caballos, Cavernas, "+
                "Canopy y de aventura en general) el cual según su modalidad será certificado y se encontrará en buen estado de mantenimiento y limpieza,"+
                "lo que implica que según la modalidad de prestación de servicio deberá contar con equipo certificado para la práctica de este tipo de "+
                "deportes que se caracteriza por su nivel de acto riesgo. El equipo disponible no debe tener malos olores, ni presentar desgaste o deterioro alguno. \n";
        String pregunta23 = "La empresa dispone de un local para la venta de recuerdos y artesanías.\n";

        String pregunta24 = " La Planta Física a nivel de áreas comerciales  se observa en buen estado "+
                "de Mantenimiento y Limpieza, lo que significa que cualquier construcción que se haya desarrollado "+
                "en el proyecto con fines de explotación turística, deberá contar con pisos, paredes, cielo raso, "+
                "equipo y accesorios disponibles que le garanticen al turista su buen uso y seguridad. \n";
        String pregunta25 = "Cualquier instalación con fines turísticos, a nivel de bodegas, establos, "+
                "viveros u otros de uso y acceso para el turista deberá encontrarse en buen estado de mantenimiento "+
                "a nivel de pisos, paredes, cielo raso y techos, como a nivel de equipo y accesorios. En cuanto a la "+
                "limpieza se refiere, esta incluye superficie libres de suciedad, manchas o cualquier otro detalle que "+
                "resulte desagradable a la vista del turista incluyendo la ausencia de malos olores.\n";
        String pregunta26 = " Los senderos, puentes, barandas y cualquier otro acceso peatonal \n" +
                "se observa en buen estado de mantenimiento y limpieza.";
        String pregunta27 = "Los servicios sanitarios públicos están equipados con los accesorios básicos : "+
                "Porta-papel, porta-toallas, secador de manos,  espejos, jabonera líquida, y basureros";
        String pregunta28 = "La loza sanitaria a nivel de inodoros, lavabos, y otros, se encuentra en buen estado de mantenimiento y limpieza, esto significa que debe tener todas sus piezas completas a nivel de inodoro, tanque y lavatorio, siendo el acabado del mismo acorde  para sus propósitos de operación. En lo que respecta a la limpieza dicha loza debe encontrarse libre de manchas y de suciedad alguna como de malos olores.\n";
        String pregunta29 = "La planta física a nivel de Servicios Sanitarios se encuentra en buen estado de mantenimiento y limpieza a nivel de pisos, paredes, cielo raso, puertas y ventanas debe encontrase libre de deterioro alguno, reflejando un buen acabado en sus materiales constructivos, como en su textura y pinturas tanto exteriores como interiores.\n";
        String pregunta30 = "El personal que atiende a los turistas lleva su correspondiente gafete.\n";
        String pregunta31 = "El personal estará debidamente uniformado.\n";
        String pregunta32 = "El personal se encontrará capacitado según los puestos de trabajo.\n";
        String pregunta33 = "\"Se dispone   de  Areas y de Información ( Visual, sonora o de texto)  para Personas \n" +
                "con Capacidad Física Restringida.\"\n";

        String pregunta34 = "La empresa da a conocer el patrimonio natural existente en el sitio en donde se realizan las actividades.\n";
        String pregunta35 = "La empresa da a conocer el patrimonio cultural existente en el sitio donde se realizan las actividades.\n";
        String pregunta36 = "La empresas demuestra que promueve la Educación Ambiental y consolida la Cultura Ambientalista.\n";
        String pregunta37 = "Se establecen recomendaciones para el Turista sobre su comportamiento para con el medio natural.\n";
        String pregunta38 = "La empresa demuestra que esta interesada en implementar medidas para reducir su impacto con el medio ambiente (uso de productos biodegradables, etc.).\n";
        String pregunta39 = "La empresa demuestra  que desarrolla prácticas ambientales sostenibles.\n";
        String pregunta40 = "La empresa incluye dentro de sus actividades espectáculos o expresiones artístico-culturales. \n";
        String pregunta41 = "La empresa apega sus diseños al modelo de Arquitectura  propios de su región.\n";
        String pregunta42 = "\"Se da  la puesta en valor de la gastronomía local, como un elemento de \n" +
                "rescate del patrimonio costarricense.\"\n";
        String pregunta43 = "La empresa desarrolla programas ambientales con la comunidad inmediata\n";
        String pregunta44 = "La empresa dispone de programas ambientales específicos para la conservación de los recursos naturales\n";
        String pregunta45 = "La experiencia dentro del sitio  permite  reconocer elementos culturales locales además de los nacionales.\n";

        String pregunta46 = "La declaración de Misión de la Organización menciona \"el servicio al cliente\" como parte de su carácter especial.\n";
        String pregunta47 = "La empresa demuestra  que tiene una política escrita de servicio al cliente\n";
        String pregunta48 = "El servicio al cliente esta incluido en el  Plan de Mercadeo\n";
        String pregunta49 = "Se comunican las políticas de servicio a los clientes. \n";
        String pregunta50 = "La empresa dispone de un sistema de medición de la satisfacción del cliente.\n";
        String pregunta51 = "La Junta Directiva o el más alto nivel de la empresa utiliza la información del servicio al cliente como base para tomar decisiones.\n";
        String pregunta52 = "La Junta Directiva consigna recursos suficientes para dar mantenimiento o seguimiento la tema de servicio al cliente. \n";
        String pregunta53 = "Para el servicio al cliente  se recogen datos esenciales mediante la aplicación de una boleta.\n";
        String pregunta54 = "Las boletas o formularios relacionados con el servicio al cliente  se llevan en un archivo  debidamente foliado.\n";
        String pregunta55 = "Al personal se le dan instrucciones claras respecto a la naturaleza de su esperada contribución  al servicio al cliente. \n";
        String pregunta56 = "El servicio al cliente se evalúa periódicamente en busca de la mejora continúa.\n";
        String pregunta57 = "La empresa tiene un procedimiento legal para tratar las quejas de los turistas consumidores y que esta reflejado en su documento de contrato.\n";
        String pregunta58 = "Sigue y contesta las quejas que surgen de sus Representantes o Comercializadores" +
                "(Otros prestadores de Servicios como las Oficinas de Reservaciones, Agencias de Viajes, Hoteles, etc.";
        String pregunta59 = "La empresa proporciona  entrenamiento periódico para reforzar la importancia del servicio al cliente.";


        binaryChapter1.addQuestion(new BinaryQuestion(pregunta1,"1",false,false,false));
        binaryChapter1.addQuestion(new BinaryQuestion(pregunta2,"2",false,false,false));
        binaryChapter1.addQuestion(new BinaryQuestion(pregunta3,"3",false,false,false));
        binaryChapter1.addQuestion(new BinaryQuestion(pregunta4,"4",false,false,false));
        binaryChapter1.addQuestion(new BinaryQuestion(pregunta5,"5",false,false,false));
        binaryChapter1.addQuestion(new BinaryQuestion(pregunta6,"6",false,false,false));
        binaryChapter1.addQuestion(new BinaryQuestion(pregunta7,"7",false,false,false));
        binaryChapter1.addQuestion(new BinaryQuestion(pregunta8,"8",false,false,false));
        binaryChapter1.addQuestion(new BinaryQuestion(pregunta9,"9",false,false,false));
        binaryChapter1.addQuestion(new BinaryQuestion(pregunta10,"10",false,false,false));

        binaryChapter2.addQuestion(new BinaryQuestion(pregunta11,"11",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta12,"12",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta13,"13",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta14,"14",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta15,"15",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta16,"16",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta17,"17",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta18,"18",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta19,"19",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta20,"20",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta21,"21",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta22,"22",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta23,"23",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta24,"24",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta25,"25",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta26,"26",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta27,"27",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta28,"28",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta29,"29",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta30,"30",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta31,"31",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta32,"32",false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion(pregunta33,"33",false,false,false));

        binaryChapter3.addQuestion(new BinaryQuestion(pregunta34,"34",false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion(pregunta35,"35",false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion(pregunta36,"36",false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion(pregunta37,"37",false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion(pregunta38,"38",false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion(pregunta39,"39",false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion(pregunta40,"40",false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion(pregunta41,"41",false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion(pregunta42,"42",false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion(pregunta43,"43",false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion(pregunta44,"44",false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion(pregunta45,"45",false,false,false));

        binaryChapter4.addQuestion(new BinaryQuestion(pregunta46,"46",false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion(pregunta47,"47",false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion(pregunta48,"48",false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion(pregunta49,"49",false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion(pregunta50,"50",false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion(pregunta51,"51",false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion(pregunta52,"52",false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion(pregunta53,"53",false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion(pregunta54,"54",false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion(pregunta55,"55",false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion(pregunta56,"56",false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion(pregunta57,"57",false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion(pregunta58,"58",false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion(pregunta59,"59",false,false,false));

        formTematics.addChapter(binaryChapter1);
        formTematics.addChapter(binaryChapter2);
        formTematics.addChapter(binaryChapter3);
        formTematics.addChapter(binaryChapter4);

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
