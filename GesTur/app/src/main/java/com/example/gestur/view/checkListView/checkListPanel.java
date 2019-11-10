package com.example.gestur.view.checkListView;

import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.logic.checkList.CheckListQuestion;
import com.example.gestur.view.main.AbstractActivity;
import com.example.gestur.view.main.AbstractActivityComponent;

import java.util.ArrayList;

public class CheckListPanel extends AbstractActivityComponent implements ICheckListPanelConstants{

    private CheckListForm checkListForm;
    private RelativeLayout layout;
    private AbstractActivity context;

    private TextView textLegalQuestions;
    private TextView textTechQuestions;

    private ArrayList<CheckListQuestionView> questionLegalViews;
    private ArrayList<CheckListQuestionView> questionTechViews;


    public CheckListPanel(CheckListForm form, AbstractActivity context){
        super();
        this.checkListForm =  form;
        this.context = context;

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
    @Override
    protected void setItemsBoundsHorizontal() {
        setBounds(textLegalQuestions,1,TEXT_HEIGHT_V,0,true,false);
        for(CheckListQuestionView view:questionLegalViews){
            view.addComponents(width,height,totalY+layoutY,layout);
            totalY+= view.getHeight();
        }
        setBounds(textTechQuestions,1,TEXT_HEIGHT_V,0,true,false);
        for(CheckListQuestionView view:questionTechViews){
            view.addComponents(width,height,totalY+layoutY,layout);
            totalY+= view.getHeight();
        }
    }

    @Override
    protected void setItemsBoundsVertical() {
        setBounds(textLegalQuestions,1,TEXT_HEIGHT_V,0,true,false);
        for(CheckListQuestionView view:questionLegalViews){
            view.addComponents(width,height,totalY+layoutY,layout);
            totalY+= view.getHeight();
        }
        setBounds(textTechQuestions,1,TEXT_HEIGHT_V,0,true,false);
        for(CheckListQuestionView view:questionTechViews){
            view.addComponents(width,height,totalY+layoutY,layout);
            totalY+= view.getHeight();
        }
    }

    @Override
    protected void setItemsConfiguration() {
        textLegalQuestions.setText(TEXT_LEGAL);
        textLegalQuestions.setTextSize(getTextSize(55));
        textLegalQuestions.setGravity(Gravity.CENTER);

        textTechQuestions.setText(TEXT_TECH);
        textTechQuestions.setTextSize(getTextSize(55));
        textTechQuestions.setGravity(Gravity.CENTER);


    }
    private void addItems(){
        layout.addView(textLegalQuestions);
        layout.addView(textTechQuestions);

    }
    private void createItems(){
        textLegalQuestions = new TextView(context);
        textTechQuestions = new TextView(context);

        questionLegalViews = new ArrayList<>();
        questionTechViews = new ArrayList<>();

        int counter = 1;
        for(CheckListQuestion question:checkListForm.getQuestionsLegal()){
            questionLegalViews.add(new CheckListQuestionView(question,counter,context));
            counter++;
        }
        counter = 1;
        for(CheckListQuestion question:checkListForm.getQuestionsTech()){
            questionTechViews.add(new CheckListQuestionView(question,counter,context));
            counter++;
        }
    }
}
