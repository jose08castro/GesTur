package com.example.gestur.view.scoreChapterView;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.gestur.logic.questions.ScoreObsQuestion;
import com.example.gestur.view.ChapterView;
import com.example.gestur.view.main.AbstractActivityComponent;

import java.util.ArrayList;

public class ScoreObservationQuestionView extends AbstractActivityComponent implements IScoreObservationQuestionViewConstants{

    private RelativeLayout layout;
    private ChapterView context;
    private ScoreObsQuestion question;

    private TextView textNumber;
    private TextView textQuestion;
    private CheckBox naCheckbox;
    private Spinner spinner;
    private EditText editObservation;

    public ScoreObservationQuestionView(ScoreObsQuestion question, ChapterView context){
        super();
        this.question = question;
        this.context = context;
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;
        this.layout = layout;
        createItems();
        loadSpinner();
        setItemsConfiguration();
        setItemsBounds();
        setListeners();
        addItems();
    }
    private void setListeners(){
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                question.setScore(Integer.parseInt((String)(spinner.getSelectedItem())));
                context.update();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        naCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(naCheckbox.isChecked()){
                    question.setNA(true);
                }else{
                    question.setNA(false);
                }
                context.update();
            }
        });
        editObservation.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(!b){
                    question.setObservation(editObservation.getText().toString());
                }
            }
        });
    }
    @Override
    protected void setItemsBoundsHorizontal() {
        int newHeight = getTextViewHeight(textQuestion,(int)(textQuestionWidth*width))+100;
        setBounds(textNumber,textNumberWidth,text_height,startX,false,false);
        setSpinnerBounds(spinner,spinnerWidth,text_height,startSpinner,false,false);
        setBounds(naCheckbox,checkBoxWidth,text_height,startCheck,false,false);
        setBounds(textQuestion,textQuestionWidth,newHeight,startQuestion,true,true);
        setBounds(editObservation,observationWidth,observation_height,startObservation,true,false);
    }

    @Override
    protected void setItemsBoundsVertical() {
        int newHeight = getTextViewHeight(textQuestion,(int)(textQuestionWidth*width))+100;
        setBounds(textNumber,textNumberWidth,text_height,startX,false,false);
        setSpinnerBounds(spinner,spinnerWidth,spinner_height,startSpinner,false,false);
        setBounds(naCheckbox,checkBoxWidth,box_height,startCheck,false,false);
        setBounds(textQuestion,textQuestionWidth,newHeight,startQuestion,true,true);
        setBounds(editObservation,observationWidth,observation_height,startObservation,true,false);
    }

    @Override
    protected void setItemsConfiguration() {
        textNumber.setText(question.getNumber());
        textQuestion.setText(question.getQuestion());
        if(question.isNA()){
            naCheckbox.setChecked(true);
        }else{
            naCheckbox.setChecked(false);
        }
        spinner.setSelection(question.getScore());
        editObservation.setText(question.getObservation());
        editObservation.setTextSize(getTextSize(60));
        editObservation.clearFocus();
    }
    private void loadSpinner(){
        ArrayList<String> strings = new ArrayList<String>();
        for(int i = question.getMinScore();i<=question.getMaxScore();i++){
            strings.add(i+"");
        }
        spinner.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, strings));
    }
    private void createItems(){
        textNumber = new TextView(context);
        textQuestion = new TextView(context);
        naCheckbox = new CheckBox(context);
        spinner = new Spinner(context);
        editObservation = new EditText(context);
    }
    private void addItems(){
        layout.addView(textNumber);
        layout.addView(textQuestion);
        layout.addView(spinner);
        layout.addView(naCheckbox);
        layout.addView(editObservation);
    }
}
