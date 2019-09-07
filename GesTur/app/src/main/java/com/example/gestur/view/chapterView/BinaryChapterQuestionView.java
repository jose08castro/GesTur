package com.example.gestur.view.chapterView;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.questions.BinaryQuestion;
import com.example.gestur.view.ChapterView;
import com.example.gestur.view.IQuestion;

public class BinaryChapterQuestionView implements IQuestion, IBinaryViewConstants {

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

    public BinaryChapterQuestionView(BinaryQuestion binaryQuestion, ChapterView context){
        this.binaryQuestion = binaryQuestion;
        questionView = new TextView(context);
        numberView = new TextView(context);
        buttonYes = new RadioButton(context);
        buttonNo = new RadioButton(context);
        buttonNA = new RadioButton(context);

        this.context = context;

        questionView.setText(binaryQuestion.getQuestion());
        numberView.setText(String.valueOf(binaryQuestion.getNumber()));
        setListeners();
    }
    @Override
    public void addComponents(int screenX, int screenY,int currentY, RelativeLayout layout) {

        buttonYes.setText("");
        buttonNo.setText("");
        buttonNA.setText("");

        questionView.setWidth((int)(screenX*textWidth));
        numberView.setWidth((int)(screenX*numberWidth));
        buttonYes.setWidth((int)(screenX*radioButtonWidth));
        buttonNo.setWidth((int)(screenX*radioButtonWidth));
        buttonNA.setWidth((int)(screenX*radioButtonWidth));

        questionView.setHeight((int)(screenY*textHeight));
        numberView.setHeight((int)(screenY*numberHeight));
        buttonYes.setHeight((int)(radioButtonHeight));
        buttonNo.setHeight((int)(radioButtonHeight));
        buttonNA.setHeight((int)(radioButtonHeight));

        questionView.setX(screenX*questionX);
        numberView.setX(screenX*startX);
        buttonYes.setX(yesX*screenX);
        buttonNo.setX(noX*screenX);
        buttonNA.setX(naX*screenX);

        questionView.setY(currentY);
        numberView.setY(currentY);
        buttonYes.setY(currentY);
        buttonNo.setY(currentY);
        buttonNA.setY(currentY);

        if(binaryQuestion.isYes()){
            buttonYes.setChecked(true);
        }
        if(binaryQuestion.isNo()){
            buttonNo.setChecked(true);
        }
        if(binaryQuestion.isNA()){
            buttonNA.setChecked(true);
        }

        layout.addView(numberView);
        layout.addView(questionView);
        layout.addView(buttonYes);
        layout.addView(buttonNo);
        layout.addView(buttonNA);
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
