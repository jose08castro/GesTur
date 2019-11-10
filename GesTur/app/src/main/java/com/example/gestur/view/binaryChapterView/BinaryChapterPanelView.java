package com.example.gestur.view.binaryChapterView;

import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.questions.BinaryQuestion;
import com.example.gestur.view.ChapterView;
import com.example.gestur.view.main.AbstractActivityComponent;

import java.util.ArrayList;

public class BinaryChapterPanelView extends AbstractActivityComponent implements IBinaryViewConstants {

    private TextView textNumber;
    private TextView textReq;
    private TextView textYes;
    private TextView textNo;
    private TextView textNa;

    private TextView textTotalYes;
    private TextView textTotalNo;
    private TextView textTotalNa;
    private TextView textTotal;

    private ArrayList<BinaryQuestionView> questions;
    private BinaryChapter chapter;
    private ChapterView context;

    private RelativeLayout layout;

    public BinaryChapterPanelView(BinaryChapter chapter, ChapterView context){
        this.context = context;
        textNumber = new TextView(context);
        textReq = new TextView(context);
        textYes = new TextView(context);
        textNo = new TextView(context);
        textNa = new TextView(context);

        textTotal = new TextView(context);
        textTotalYes = new TextView(context);
        textTotalNo = new TextView(context);
        textTotalNa = new TextView(context);
        this.chapter = chapter;
        createQuestions(context);
    }

    public void createQuestions(ChapterView context){
        questions = new ArrayList<>();
        for(BinaryQuestion question: chapter.getQuestions()){
            questions.add(new BinaryQuestionView(question,context));
        }
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;
        this.layout = layout;
        setItemsConfiguration();
        addDataBar();
        addQuestions();
        addTotalsBar();
        update();
    }

    @Override
    protected void setItemsBoundsHorizontal() {

    }

    @Override
    protected void setItemsBoundsVertical() {

    }

    @Override
    protected void setItemsConfiguration() {
        textNumber.setText("#");
        textNumber.setGravity(Gravity.CENTER);
        textReq.setText("Requerimientos");
        textReq.setGravity(Gravity.CENTER);
        textYes.setText("Si");
        textYes.setGravity(Gravity.CENTER);
        textNo.setText("No");
        textNo.setGravity(Gravity.CENTER);
        textNa.setText("NA");
        textNa.setGravity(Gravity.CENTER);

        textTotal.setText("Total");
        textTotalYes.setText("0");
        textTotalNo.setText("0");
        textTotalNa.setText("0");
    }


    public void update() {
        textTotalYes.setText(String.valueOf(chapter.getYesQuestions()));
        textTotalNo.setText(String.valueOf(chapter.getNoQuestions()));
        textTotalNa.setText(String.valueOf(chapter.getNAQuestions()));
    }

    private void addDataBar(){

        setBounds(textNumber,numberWidth,dataBarHeight,startX,false,false);
        setBounds(textReq,textWidth,dataBarHeight,questionX,false,false);
        setBounds(textYes,radioButtonWidth,dataBarHeight,yesX,false,false);
        setBounds(textNo,radioButtonWidth,dataBarHeight,noX,false,false);
        setBounds(textNa,radioButtonWidth,dataBarHeight,naX,true,false);

        layout.addView(textNumber);
        layout.addView(textReq);
        layout.addView(textYes);
        layout.addView(textNo);
        layout.addView(textNa);

    }
    private void addQuestions(){
        for(int i = 0;i<questions.size();i++){
            questions.get(i).addComponents(width,height,totalY+layoutY,layout);
            totalY += questions.get(i).getHeight();
        }
    }
    private void addTotalsBar(){
        setBounds(textTotal,textWidth,totalsBarHeight,questionX,false,false);
        setBounds(textTotalYes,radioButtonWidth,totalsBarHeight,yesX,false,false);
        setBounds(textTotalNo,radioButtonWidth,totalsBarHeight,noX,false,false);
        setBounds(textTotalNa,radioButtonWidth,totalsBarHeight,naX,true,false);

        layout.addView(textTotal);
        layout.addView(textTotalYes);
        layout.addView(textTotalNo);
        layout.addView(textTotalNa);

    }
}
