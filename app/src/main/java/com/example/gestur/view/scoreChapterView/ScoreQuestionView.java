package com.example.gestur.view.scoreChapterView;

import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.gestur.logic.questions.ScoreQuestion;
import com.example.gestur.view.ChapterView;
import com.example.gestur.view.IQuestion;
import com.example.gestur.view.IScoreViewConstants;

import java.util.ArrayList;

public class ScoreQuestionView implements IQuestion, IScoreQuestionViewConstants {

    private TextView textNumber;
    private TextView textQuestion;
    private CheckBox naCheckbox;
    private Spinner spinner;

    private ScoreQuestion question;
    private ChapterView context;

    private int totalY;

    public ScoreQuestionView(ScoreQuestion question, ChapterView context){
        this.question = question;
        this.context = context;

        textNumber = new TextView(context);
        textQuestion = new TextView(context);
        naCheckbox = new CheckBox(context);
        spinner = new Spinner(context);
        //spinner.getSelectedItem();
    }
    private void loadSpinner(){
        ArrayList<String> strings = new ArrayList<String>();
        for(int i = question.getMinScore();i<=question.getMaxScore();i++){
            strings.add(i+"");
        }
        spinner.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, strings));
    }

    private void configComponents(){
        textNumber.setText(question.getNumber());
        textQuestion.setText(question.getQuestion());
        if(question.isNA()){
            naCheckbox.setChecked(true);
        }else{
            naCheckbox.setChecked(false);
        }
        spinner.setSelection(question.getScore()-question.getMinScore());
    }
    private void configSizes(int screenX, int screenY){
        textNumber.setWidth((int)(textNumberWidth*screenX));
        textQuestion.setWidth((int)(textQuestionWidth*screenX));
        spinner.setMinimumWidth((int)(spinnerWidth*screenX));
        naCheckbox.setWidth((int)(checkBoxWidth*screenX));

        textNumber.setHeight((int)(height*screenY));
        textQuestion.setHeight((int)(height*screenY));
        spinner.setMinimumHeight((int)(height*screenY));
        naCheckbox.setHeight((int)(height*screenY));
    }
    private void configPositions(int screenX,int currentY){
        textNumber.setX(startX*screenX);
        textQuestion.setX(startQuestion*screenX);
        spinner.setX(startSpinner*screenX);
        naCheckbox.setY(startCheck*screenX);

        textNumber.setY(currentY);
        textQuestion.setY(currentY);
        spinner.setY(currentY);
        naCheckbox.setY(currentY);
    }
    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        loadSpinner();
        configComponents();
        configSizes(screenX,screenY);
        configPositions(screenX,currentY);

        layout.addView(textNumber);
        layout.addView(textQuestion);
        layout.addView(spinner);
        layout.addView(naCheckbox);

        totalY = (int)(screenY*height);
    }

    @Override
    public int getHeight() {
        return totalY;
    }
}
