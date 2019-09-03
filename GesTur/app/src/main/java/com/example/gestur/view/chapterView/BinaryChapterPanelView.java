package com.example.gestur.view.chapterView;

import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.BinaryChapter;
import com.example.gestur.logic.BinaryQuestion;
import com.example.gestur.view.ChapterView;
import com.example.gestur.view.IPanelView;

import java.util.ArrayList;

public class BinaryChapterPanelView implements IPanelView, IBinaryViewConstants {

    private TextView textNumber;
    private TextView textReq;
    private TextView textYes;
    private TextView textNo;
    private TextView textNa;

    private TextView textTotalYes;
    private TextView textTotalNo;
    private TextView textTotalNa;
    private TextView textTotal;

    private int panelHeight;

    private ArrayList<BinaryChapterQuestionView> questions;
    private BinaryChapter chapter;
    private ChapterView context;

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

        panelHeight = 0;
        this.chapter = chapter;

        createQuestions(context);
    }

    public void createQuestions(ChapterView context){
        questions = new ArrayList<>();
        for(BinaryQuestion question: chapter.getQuestions()){
            questions.add(new BinaryChapterQuestionView(question,context));
        }
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {

        addDataBar(screenX,screenY,currentY,layout);
        addQuestions(screenX,screenY, currentY+panelHeight,layout);
        addTotalsBar(screenX,screenY,currentY+panelHeight,layout);
        update();
    }

    @Override
    public int getHeight() {
        return panelHeight;
    }

    @Override
    public void update() {
        textTotalYes.setText(String.valueOf(chapter.getYesQuestions()));
        textTotalNo.setText(String.valueOf(chapter.getNoQuestions()));
        textTotalNa.setText(String.valueOf(chapter.getNAQuestions()));
    }

    private void addDataBar(int screenX, int screenY, int currentY, RelativeLayout layout){

        textNumber.setText("#");
        textNumber.setX(startX*screenX);
        textNumber.setY(currentY);
        textNumber.setWidth((int)(numberWidth*screenX));
        textNumber.setHeight((int)(dataBarHeight*screenY));

        textReq.setText("Requerimientos");
        textReq.setX(questionX*screenX);
        textReq.setY(currentY);
        textReq.setWidth((int)(textWidth*screenX));
        textReq.setHeight((int)(dataBarHeight*screenY));

        textYes.setText("Si");
        textYes.setX(yesX*screenX);
        textYes.setY(currentY);
        textYes.setWidth((int)(radioButtonWidth*screenX));
        textYes.setHeight((int)(dataBarHeight*screenY));

        textNo.setText("No");
        textNo.setX(noX*screenX);
        textNo.setY(currentY);
        textNo.setWidth((int)(radioButtonWidth*screenX));
        textNo.setHeight((int)(dataBarHeight*screenY));

        textNa.setText("NA");
        textNa.setX(naX*screenX);
        textNa.setY(currentY);
        textNa.setWidth((int)(radioButtonWidth*screenX));
        textNa.setHeight((int)(dataBarHeight*screenY));

        layout.addView(textNumber);
        layout.addView(textReq);
        layout.addView(textYes);
        layout.addView(textNo);
        layout.addView(textNa);

        panelHeight += dataBarHeight*screenY;
    }
    private void addQuestions(int screenX, int screenY, int currentY, RelativeLayout layout){
        for(int i = 0;i<questions.size();i++){
            questions.get(i).addComponents(screenX,screenY,currentY,layout);
            currentY+=(screenY*textHeight);
            panelHeight +=(screenY*textHeight);
        }
    }
    private void addTotalsBar(int screenX, int screenY, int currentY, RelativeLayout layout){
        textTotal.setText("Total");
        textTotal.setX(screenX*questionX);
        textTotal.setY(currentY);
        textTotal.setWidth((int)(screenX*textWidth));
        textTotal.setHeight((int)(screenY*totalsBarHeight));

        textTotalYes.setText("0");
        textTotalYes.setX(screenX*yesX);
        textTotalYes.setY(currentY);
        textTotalYes.setWidth((int)(screenX*radioButtonWidth));
        textTotalYes.setHeight((int)(screenY*totalsBarHeight));

        textTotalNo.setText("0");
        textTotalNo.setX(screenX*noX);
        textTotalNo.setY(currentY);
        textTotalNo.setWidth((int)(screenX*radioButtonWidth));
        textTotalNo.setHeight((int)(screenY*totalsBarHeight));

        textTotalNa.setText("0");
        textTotalNa.setX(screenX*naX);
        textTotalNa.setY(currentY);
        textTotalNa.setWidth((int)(screenX*radioButtonWidth));
        textTotalNa.setHeight((int)(screenY*totalsBarHeight));

        layout.addView(textTotal);
        layout.addView(textTotalYes);
        layout.addView(textTotalNo);
        layout.addView(textTotalNa);

        panelHeight += totalsBarHeight*screenY;

    }
}
