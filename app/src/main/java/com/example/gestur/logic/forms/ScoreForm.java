package com.example.gestur.logic.forms;

import com.example.gestur.logic.chapters.ScoreChapter;

import java.util.ArrayList;

public class ScoreForm extends Form{

    protected int applicablePoints;
    protected int NApoints;
    protected ArrayList<ScoreChapter> chapters;

    public ScoreForm(String name,int type,ArrayList<ScoreChapter> chapters){
        super(name,type);
        applicablePoints = 0;
        NApoints = 0;
        this.chapters = new ArrayList<>();
        addChapters(chapters);
        update();
    }

    @Override
    public void update(){
        totalPoints = 0;
        applicablePoints = 0;
        achievedPercentage = 0f;
        NApoints = 0;
        achievedPoints = 0;
        if(chapters!=null) {
            for (ScoreChapter chapter : chapters) {
                totalPoints += chapter.getTotalPoints();
                applicablePoints += chapter.getApplicablePoints();
                achievedPercentage += chapter.getAchievedFormPercentage();
                achievedPoints += chapter.getAchievedChapterPoints();
                NApoints += chapter.getNaPoints();
            }
        }
    }

    public void addChapters(ArrayList<ScoreChapter> chapters){
        if(chapters!=null) {
            for (ScoreChapter chapter : chapters) {
                addChapter(chapter);
            }
        }
    }
    public void addChapter(ScoreChapter chapter){

        chapter.setForm(this);
        chapters.add(chapter);
    }
}
