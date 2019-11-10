package com.example.gestur.view.checkListView;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.AbstractActivityComponent;
import com.example.gestur.view.main.LobbyActivity;

public class CheckListFooter extends AbstractActivityComponent implements ICheckListFooterConstants{

    private AbstractActivity context;
    private CheckListForm checkListForm;
    private RelativeLayout layout;

    private TextView textPercentage;
    private Button buttonBack;

    public CheckListFooter(CheckListForm form,AbstractActivity context){
        super();
        this.checkListForm = form;
        this.context = context;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        this.layout = layout;
        width = screenX;
        height = screenY;
        layoutY = currentY;
        createItems();
        setItemsConfiguration();
        setItemsBounds();
        addItems();
    }

    @Override //Currently same than vertical
    protected void setItemsBoundsHorizontal() {
        setBounds(textPercentage,1,TEXT_HEIGHT_V,0,true,false);
        addSpace(2,100);
        setBounds(buttonBack,BUTTON_WIDTH_V,BUTTON_HEIGHT_V,0,true,false);
    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(textPercentage,1,TEXT_HEIGHT_V,0,true,false);
        addSpace(2,100);
        setBounds(buttonBack,BUTTON_WIDTH_V,BUTTON_HEIGHT_V,BUTTON_X_V,true,false);
        addSpace(5,100);
    }

    @Override
    protected void setItemsConfiguration() {
        textPercentage.setTextSize(getTextSize(50));
        textPercentage.setGravity(Gravity.CENTER);

        buttonBack.setText(TEXT_BACK);
        buttonBack.setTextSize(getTextSize(45));
        buttonBack.setGravity(Gravity.CENTER);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, LobbyActivity.class));
            }
        });

        update();
    }
    private void createItems(){
        textPercentage = new TextView(context);
        buttonBack = new Button(context);
    }
    private void addItems(){
        layout.addView(textPercentage);
        layout.addView(buttonBack);
    }
    public void update(){
        String textPer = "Porcentage actual: "+checkListForm.getAchievedPercentage()+"%";
        textPercentage.setText(textPer);
    }
}
