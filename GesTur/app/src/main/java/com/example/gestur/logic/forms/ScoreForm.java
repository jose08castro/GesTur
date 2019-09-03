package com.example.gestur.logic.forms;

import com.example.gestur.logic.ScoreChapter;

import java.util.ArrayList;

public class ScoreForm {

    private String name;
    private int totalPoints;
    private int applicablePoints;
    private int achievedPoints;
    private int NApoints;
    private float achievedPercentage;
    private ArrayList<ScoreChapter> chapters;

    public ScoreForm(String name,ArrayList<ScoreChapter> chapters){
        this.name = name;
        this.chapters = new ArrayList<>();
        addChapters(chapters);
        update();
    }

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
    protected void addChapters(ArrayList<ScoreChapter> chapters){
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
