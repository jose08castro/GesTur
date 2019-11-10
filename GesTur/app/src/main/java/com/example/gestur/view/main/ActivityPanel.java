package com.example.gestur.view.main;

import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.Activity;
import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.logic.forms.Form;
import com.example.gestur.view.FormView;
import com.example.gestur.view.InfoPasser;
import com.example.gestur.view.CheckListView;

public class ActivityPanel extends AbstractActivityComponent implements  IActivityPanelConstants{

    private AbstractActivity context;

    private TextView textActivityName;
    private Button buttonForm;
    private TextView textFormPer;
    private Button buttonCheckList;
    private TextView textCheckPer;

    private Activity activity;

    private Form form;
    private CheckListForm checkListForm;

    public ActivityPanel(Activity activity,AbstractActivity context){
        super();
        this.activity = activity;
        this.context = context;
        this.form = activity.getForm();
        this.checkListForm = activity.getCheckListForm();
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;
        setItemsConfiguration();
        setItemsBounds();
        layout.addView(textActivityName);
        layout.addView(buttonForm);
        layout.addView(textFormPer);
        layout.addView(buttonCheckList);
        layout.addView(textCheckPer);
    }

    @Override
    protected void setItemsBoundsHorizontal() {
        //To do
    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(textActivityName,text_name_Width,text_name_Height,text_name_X,true,false);
        addSpace(1,100);
        setBounds(buttonForm,button_Width_V,button_height_V,button_X_V,true,false);
        addSpace(-button_height_V);
        setBounds(textFormPer,textPer_Width_V,textPer_height_V,textPer_X_V,true,false);
        addSpace(1,100);
        setBounds(buttonCheckList,button_Width_V,button_height_V,button_X_V,true,false);
        addSpace(-button_height_V);
        setBounds(textCheckPer,textPer_Width_V,textPer_height_V,textPer_X_V,true,false);
    }

    @Override
    protected void setItemsConfiguration() {
        textActivityName = new TextView(context);
        buttonForm = new Button(context);
        textFormPer = new TextView(context);
        buttonCheckList = new Button(context);
        textCheckPer = new TextView(context);

        textActivityName.setTextSize(getTextSize(50));
        textActivityName.setGravity(Gravity.CENTER);
        textActivityName.setText(activity.getName());

        buttonForm.setText(text_button_Form);
        buttonForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InfoPasser.getInstance().setCurrentForm(form);
                context.startActivity(new Intent(context, FormView.class));
            }
        });

        textFormPer.setText(String.valueOf(form.getAchievedPercentage())+"%");
        textFormPer.setTextSize(getTextSize(50));
        textFormPer.setGravity(Gravity.CENTER);

        buttonCheckList.setText(text_button_Check);
        buttonCheckList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InfoPasser.getInstance().setCurrentCheckListForm(checkListForm);
                context.startActivity(new Intent(context, CheckListView.class));
            }
        });

        textCheckPer.setText(String.valueOf(checkListForm.getAchievedPercentage())+"%");
        textCheckPer.setTextSize(getTextSize(50));
        textCheckPer.setGravity(Gravity.CENTER);

    }
}
