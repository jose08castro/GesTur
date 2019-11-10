package com.example.gestur.view.checkListView;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.checkList.CheckListQuestion;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.AbstractActivityComponent;

public class CheckListQuestionView extends AbstractActivityComponent implements ICheckListQuestionConstants {

    private CheckListQuestion question;
    private int number;

    private AbstractActivity context;
    private RelativeLayout layout;

    private TextView textNumber;
    private TextView textQuestion;
    private RadioButton buttonYes;
    private RadioButton buttonNo;

    public CheckListQuestionView(CheckListQuestion question,int number,AbstractActivity context){
        super();
        this.context = context;
        this.question = question;
        this.number = number;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;
        this.layout = layout;
        createItems();
        setItemsConfiguration();
        setItemsBounds();
        addItems();
    }
    private void createItems(){
        textNumber = new TextView(context);
        textQuestion = new TextView(context);
        buttonYes = new RadioButton(context);
        buttonNo = new RadioButton(context);
    }
    private void addItems(){
        layout.addView(textNumber);
        layout.addView(textQuestion);
        layout.addView(buttonYes);
        layout.addView(buttonNo);
    }
    @Override
    protected void setItemsBoundsHorizontal() { //Currently same than vertical
        setBounds(textNumber,NUMBER_WIDTH_V,ITEM_HEIGHT_V,NUMBER_X_V,false,false);
        setBounds(textQuestion,TEXT_WIDTH_V,ITEM_HEIGHT_V,QUESTIONS_X_V,false,false);
        setBounds(buttonYes,RADIO_BUTTON_WIDTH_V,ITEM_HEIGHT_V,YES_X_V,false,false);
        setBounds(buttonNo,RADIO_BUTTON_WIDTH_V,ITEM_HEIGHT_V,NO_X_V,true,false);
    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(textNumber,NUMBER_WIDTH_V,ITEM_HEIGHT_V,NUMBER_X_V,false,false);
        setBounds(textQuestion,TEXT_WIDTH_V,ITEM_HEIGHT_V,QUESTIONS_X_V,false,false);
        setBounds(buttonYes,RADIO_BUTTON_WIDTH_V,ITEM_HEIGHT_V,YES_X_V,false,false);
        setBounds(buttonNo,RADIO_BUTTON_WIDTH_V,ITEM_HEIGHT_V,NO_X_V,true,false);
    }

    @Override
    protected void setItemsConfiguration() {
        textNumber.setText(String.valueOf(number));
        textQuestion.setText(question.getQuestion());
        if(question.isYes()){
            buttonYes.setChecked(true);
        }else{
            question.setNo();
            buttonNo.setChecked(true);
        }
        buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(question.isNo()){
                    question.setYes();
                    buttonYes.setChecked(true);
                    buttonNo.setChecked(false);
                    context.update();
                }
            }
        });
        buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(question.isYes()){
                    question.setNo();
                    buttonNo.setChecked(true);
                    buttonYes.setChecked(false);
                    context.update();
                }
            }
        });
    }
}
