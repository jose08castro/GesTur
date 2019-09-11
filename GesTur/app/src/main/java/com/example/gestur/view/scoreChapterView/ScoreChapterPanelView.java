package com.example.gestur.view.scoreChapterView;

import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.chapters.IChapter;
import com.example.gestur.logic.chapters.ScoreChapter;
import com.example.gestur.logic.questions.ScoreQuestion;
import com.example.gestur.view.ChapterView;
import com.example.gestur.view.IPanelView;
import com.example.gestur.view.IScoreViewConstants;

import java.util.ArrayList;

public class ScoreChapterPanelView implements IPanelView, IScoreChapterPanelViewConstants, IScoreQuestionViewConstants{
    private TextView textNumber;
    private TextView textReq;
    private TextView textScore;
    private TextView textNa;

    private TextView textTotalNa;
    private TextView textTotalPoints;
    private TextView textTotalPercentage;
    private TextView textFormPercentage;

    //private TextView totalNa;
    //private TextView totalPoints;
    //private TextView totalPercentage;
    //private TextView formPercentage;

    private int panelHeight;

    private ArrayList<ScoreQuestionView> questions;
    private ScoreChapter chapter;
    private ChapterView context;

    public ScoreChapterPanelView(ScoreChapter chapter, ChapterView context){
        this.context = context;
        textNumber = new TextView(context);
        textReq = new TextView(context);
        textScore = new TextView(context);
        textNa = new TextView(context);

        textTotalNa = new TextView(context);
        textTotalPoints = new TextView(context);
        textTotalPercentage = new TextView(context);
        textFormPercentage = new TextView(context);

        panelHeight = 0;
        this.chapter = chapter;

        createQuestions(context);
    }

    public void createQuestions(ChapterView context){
        questions = new ArrayList<>();
        for(ScoreQuestion question: chapter.getQuestions()){
            questions.add(new ScoreQuestionView(question,context));
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
        textTotalNa.setText(String.valueOf(chapter.getNaPoints()));
        textTotalPoints.setText(String.valueOf(chapter.getAchievedChapterPoints()));
        textTotalPercentage.setText(String.valueOf(chapter.getAchievedChapterPercentage()));
        textFormPercentage.setText(String.valueOf(chapter.getAchievedFormPercentage()));
    }

    private void addDataBar(int screenX, int screenY, int currentY, RelativeLayout layout){
        /*
        textNumber.setText("#");
        textNumber.setX(startX*screenX);
        textNumber.setY(currentY);
        textNumber.setWidth((int)(textNumberWidth*screenX));
        textNumber.setHeight((int)(dataBarHeight*screenY));

        textReq.setText("Requerimientos");
        textReq.setX(startQuestion*screenX);
        textReq.setY(currentY);
        textReq.setWidth((int)(textQuestionWidth*screenX));
        textReq.setHeight((int)(dataBarHeight*screenY));

        textScore.setText("");
        textScore.setX(startSpinner*screenX);
        textScore.setY(currentY);
        textScore.setWidth((int)(checkBoxWidth*screenX));
        textScore.setHeight((int)(dataBarHeight*screenY));

        textNa.setText("NA");
        textNa.setX(startCheck*screenX);
        textNa.setY(currentY);
        textNa.setWidth((int)(checkBoxWidth*screenX));
        textNa.setHeight((int)(dataBarHeight*screenY));

        layout.addView(textNumber);
        layout.addView(textReq);
        layout.addView(textScore);
        layout.addView(textNa);

        panelHeight += dataBarHeight*screenY;
        */
    }
    private void addQuestions(int screenX, int screenY, int currentY, RelativeLayout layout){
        for(int i = 0;i<questions.size();i++){
            questions.get(i).addComponents(screenX,screenY,currentY,layout);
            currentY+=(screenY*height);
            panelHeight +=(screenY*height);
        }
    }
    private void addTotalsBar(int screenX, int screenY, int currentY, RelativeLayout layout) {
        /*
        textTotalPoints.setText("Total");
        textTotalPoints.setX(screenX * questionX);
        textTotalPoints.setY(currentY);
        textTotalPoints.setWidth((int) (screenX * textWidth));
        textTotalPoints.setHeight((int) (screenY * totalsBarHeight));

        textTotalPercentage.setText();
        textTotalPercentage.setX();
        textTotalPercentage.setY();
        textTotalPercentage.setWidth();
        textTotalPercentage.setHeight();


        textTotalNa.setText("0");
        textTotalNa.setX(screenX * naX);
        textTotalNa.setY(currentY);
        textTotalNa.setWidth((int) (screenX * radioButtonWidth));
        textTotalNa.setHeight((int) (screenY * totalsBarHeight));

        layout.addView(textTotalPoints);
        layout.addView(textTotalPercentage);
        layout.addView(textFormPercentage);
        layout.addView(textTotalNa);

        panelHeight += totalsBarHeight * screenY;
        */
    }
}
