package com.example.gestur.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gestur.R;
import com.example.gestur.logic.BinaryChapter;
import com.example.gestur.logic.BinaryQuestion;
import com.example.gestur.logic.ConCentersBinaryForm;
import com.example.gestur.view.InfoPasser;
import com.example.gestur.view.FormView;

public class LoginActivity extends AppCompatActivity implements ILoginActivityConstants{

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

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
                Intent i = new Intent(context, FormView.class);
                startActivity(i);
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i = new Intent(context, RegisterActivity.class);
                //startActivity(i);
            }
        });
        layout.addView(textTitle);
        layout.addView(editUserName);
        layout.addView(editPassword);
        layout.addView(checkRemember);
        layout.addView(buttonLogin);
        layout.addView(textNoAccount);
        layout.addView(buttonRegister);


        //DB db = new DB();
        //db.registerUser("josueggss73@gmail.com","warrior73");

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
        //String name = "CALIFICACION DE ACTIVIDADES TURISTICAS TEMATICAS";
        String name = "CALIFICACION DE CENTROS DE CONGRESOS Y CONVENCIONES";
        //BinaryForm form = new BinaryForm(name,null);
        ConCentersBinaryForm form = new ConCentersBinaryForm(name,"",0,0,0,null);

        BinaryChapter binaryChapter1 = new BinaryChapter("Capitulo 1: De la Organizacion",1,null,17);

        binaryChapter1.addQuestion(new BinaryQuestion("1.Cumple con las regulaciones del Ministerio de Salud.",1,false,false,false));
        binaryChapter1.addQuestion(new BinaryQuestion("1.Cumple con las regulaciones de Hacienda.",2,false,false,false));
        binaryChapter1.addQuestion(new BinaryQuestion("Inscrito ante las autoridades locales.",3,false,false,false));
        binaryChapter1.addQuestion(new BinaryQuestion("Posee un seguro de Responsabilidad Civil.",4,false,false,false));

        BinaryChapter binaryChapter2 = new BinaryChapter("Capitulo 2: De la Operacion",2,null,39);
        binaryChapter2.addQuestion(new BinaryQuestion("2.Cumple con las regulaciones del Ministerio de Salud.",1,false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion("2,.Cumple con las regulaciones de Hacienda.",2,false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion("Inscrito ante las autoridades locales.",3,false,false,false));
        binaryChapter2.addQuestion(new BinaryQuestion("Posee un seguro de Responsabilidad Civil.",4,false,false,false));

        BinaryChapter binaryChapter3 = new BinaryChapter("Capitulo 3: Variables ambientales y culturales",3,null,20);
        binaryChapter3.addQuestion(new BinaryQuestion("3.Cumple con las regulaciones del Ministerio de Salud.",1,false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion("Cumple con las regulaciones de Hacienda.",2,false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion("Inscrito ante las autoridades locales.",3,false,false,false));
        binaryChapter3.addQuestion(new BinaryQuestion("Posee un seguro de Responsabilidad Civil.",4,false,false,false));

        BinaryChapter binaryChapter4 = new BinaryChapter("Capitulo 4: Del servicio al cliente",4,null,24);
        binaryChapter4.addQuestion(new BinaryQuestion("4.Cumple con las regulaciones del Ministerio de Salud.",1,false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion("4.Cumple con las regulaciones de Hacienda.",2,false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion("Inscrito ante las autoridades locales.",3,false,false,false));
        binaryChapter4.addQuestion(new BinaryQuestion("Posee un seguro de Responsabilidad Civil.",4,false,false,false));

        form.addChapter(binaryChapter1);
        form.addChapter(binaryChapter2);
        form.addChapter(binaryChapter3);
        form.addChapter(binaryChapter4);

        //InfoPasser.getInstance().setCurrentForm(form);

        InfoPasser.getInstance().setCurrentForm(form);
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
