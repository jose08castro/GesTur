package com.example.gestur.view.binaryChapterView;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.questions.BinaryQuestion;
import com.example.gestur.view.ChapterView;
import com.example.gestur.view.IQuestion;
import com.example.gestur.view.main.AbstractActivityComponent;

public class BinaryQuestionView extends AbstractActivityComponent implements IQuestion, IBinaryQuestionViewConstants {

    private BinaryQuestion binaryQuestion;

    private TextView questionView;
    private TextView numberView;

    private RadioButton buttonYes;
    private RadioButton buttonNo;
    private RadioButton buttonNA;

    private ChapterView context;

    private View.OnClickListener YesListener;
    private View.OnClickListener NoListener;
    private View.OnClickListener NAListener;

    public BinaryQuestionView(BinaryQuestion binaryQuestion, ChapterView context){
        this.binaryQuestion = binaryQuestion;
        questionView = new TextView(context);
        numberView = new TextView(context);
        buttonYes = new RadioButton(context);
        buttonNo = new RadioButton(context);
        buttonNA = new RadioButton(context);
        this.context = context;
    }
    @Override
    public void addComponents(int screenX, int screenY,int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;
        setItemsConfiguration();
        setItemsBounds();
        layout.addView(numberView);
        layout.addView(questionView);
        layout.addView(buttonYes);
        layout.addView(buttonNo);
        layout.addView(buttonNA);
    }

    @Override
    protected void setItemsBoundsHorizontal() {

        int newHeight = getTextViewHeight(questionView,(int)(textWidth*width));
        setBounds(numberView,numberWidth,numberHeight,startX,false,false);
        setBounds(buttonYes,radioButtonWidth,radioButtonHeight,yesX,false,false);
        setBounds(buttonNo,radioButtonWidth,radioButtonHeight,noX,false,false);
        setBounds(buttonNA,radioButtonWidth,radioButtonHeight,naX,true,false);
        setBounds(questionView,textWidth,newHeight,questionX,true,true);
    }

    @Override
    protected void setItemsBoundsVertical() {
        int newHeight = getTextViewHeight(questionView,(int)(textWidth*width));
        setBounds(numberView,numberWidth,numberHeight,startX,false,false);
        setBounds(buttonYes,radioButtonWidth,radioButtonHeight,yesX,false,false);
        setBounds(buttonNo,radioButtonWidth,radioButtonHeight,noX,false,false);
        setBounds(buttonNA,radioButtonWidth,radioButtonHeight,naX,false,false);
        setBounds(questionView,textWidth,newHeight,questionX,true,true);
    }

    @Override
    protected void setItemsConfiguration() {
        questionView.setText(binaryQuestion.getQuestion());
        numberView.setText(String.valueOf(binaryQuestion.getNumber()));
        buttonYes.setText("");
        buttonNo.setText("");
        buttonNA.setText("");

        if(binaryQuestion.isYes()){
            buttonYes.setChecked(true);
        }
        if(binaryQuestion.isNo()){
            buttonNo.setChecked(true);
        }
        if(binaryQuestion.isNA()){
            buttonNA.setChecked(true);
        }
        setListeners();
    }

    private void setListeners(){
        YesListener = new View.OnClickListener(){
            public void onClick(View v) {
                if(binaryQuestion.isYes()){
                    buttonYes.setChecked(false);
                    binaryQuestion.setNone();
                }
                else{
                    buttonNo.setChecked(false);
                    buttonNA.setChecked(false);
                    binaryQuestion.setYes();
                }
                context.update();
            }
        };
        NoListener = new View.OnClickListener(){
            public void onClick(View v) {
                if(binaryQuestion.isNo()==true){
                    buttonNo.setChecked(false);
                    binaryQuestion.setNone();
                }
                else{
                    buttonYes.setChecked(false);
                    buttonNA.setChecked(false);
                    binaryQuestion.setNo();
                }
                context.update();
            }
        };
        NAListener = new View.OnClickListener(){
            public void onClick(View v) {
                if(binaryQuestion.isNA()==true){
                    buttonNA.setChecked(false);
                    binaryQuestion.setNone();
                }else {
                    buttonNo.setChecked(false);
                    buttonYes.setChecked(false);
                    binaryQuestion.setNA();
                }
                context.update();
            }
        };
        buttonYes.setOnClickListener(YesListener);
        buttonNo.setOnClickListener(NoListener);
        buttonNA.setOnClickListener(NAListener);
    }
}
