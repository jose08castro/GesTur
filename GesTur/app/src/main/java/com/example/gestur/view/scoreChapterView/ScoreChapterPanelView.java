package com.example.gestur.view.scoreChapterView;

import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.gestur.logic.chapters.IChapter;
import com.example.gestur.logic.chapters.ScoreChapter;
import com.example.gestur.logic.questions.HotelQuestion;
import com.example.gestur.logic.questions.ScoreObsQuestion;
import com.example.gestur.logic.questions.ScoreQuestion;
import com.example.gestur.view.ChapterView;
import com.example.gestur.view.IPanelView;
import com.example.gestur.view.IScoreViewConstants;
import com.example.gestur.view.InfoPasser;
import com.example.gestur.view.main.AbstractActivityComponent;
import com.example.gestur.view.main.IActivityComponent;

import java.util.ArrayList;

public class ScoreChapterPanelView extends AbstractActivityComponent implements IPanelView, IScoreChapterPanelViewConstants, IScoreQuestionViewConstants{

    private TextView textNumber;
    private TextView textReq;
    private TextView textScore;
    private TextView textNa;

    private TextView textTotalNa;
    private TextView textTotalPoints;
    private TextView textTotalPercentage;
    private TextView textFormPercentage;

    private ArrayList<IActivityComponent> questions;

    private ScoreChapter chapter;
    private ChapterView context;
    private RelativeLayout layout;

    public ScoreChapterPanelView(ScoreChapter chapter, ChapterView context){
        this.context = context;
        this.chapter = chapter;

        textNumber = new TextView(context);
        textReq = new TextView(context);
        textScore = new TextView(context);
        textNa = new TextView(context);

        textTotalNa = new TextView(context);
        textTotalPoints = new TextView(context);
        textTotalPercentage = new TextView(context);
        textFormPercentage = new TextView(context);

        createQuestions(context);
    }

    public void createQuestions(ChapterView context){
        questions = new ArrayList<>();
        int type = InfoPasser.getInstance().getCurrentForm().getType();
        if(type == 2){
            for(ScoreQuestion question: chapter.getQuestions()){
                questions.add(new HotelQuestionView((HotelQuestion) question,context));
            }
        }else if(type == 10 || type == 11){
            for(ScoreQuestion question: chapter.getQuestions()){
                questions.add(new ScoreQuestionView(question,context));
            }
        }else if(type == 14){
            for(ScoreQuestion question: chapter.getQuestions()){
                questions.add(new ScoreObservationQuestionView((ScoreObsQuestion)question,context));
            }
        }
    }

    @Override
    public void addComponents(int screenX, int screenY, int currentY, RelativeLayout layout) {
        width = screenX;
        height = screenY;
        layoutY = currentY;
        this.layout = layout;
        //createItems();
        //setItemsConfiguration();
        //setItemsBounds();
        addItems();
        //addQuestions(screenX,screenY,currentY,la);
        update();
    }
    private void createItems(){

    }
    private void addItems(){
        for(IActivityComponent questionView: questions){
            questionView.addComponents(width,height,layoutY+totalY,layout);
            totalY+=questionView.getHeight();
        }
    }
    @Override
    protected void setItemsBoundsHorizontal() {

    }

    @Override
    protected void setItemsBoundsVertical() {

    }

    @Override
    protected void setItemsConfiguration() {

    }

    @Override
    public void update() {
        textTotalNa.setText(String.valueOf(chapter.getNaPoints()));
        textTotalPoints.setText(String.valueOf(chapter.getAchievedChapterPoints()));
        textTotalPercentage.setText(String.valueOf(chapter.getAchievedChapterPercentage()));
        textFormPercentage.setText(String.valueOf(chapter.getAchievedFormPercentage()));
    }


    private void addQuestions(){
        for(int i = 0;i<questions.size();i++){
            questions.get(i).addComponents(width,height,totalY+layoutY,layout);
            totalY += questions.get(i).getHeight();
        }
    }

}
