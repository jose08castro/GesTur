package com.example.gestur.logic.forms;

import com.example.gestur.logic.BinaryChapter;

import java.util.ArrayList;

public class BinaryForm{

    protected String name;
    private int totalPoints;
    private int achievedPoints;
    private float achievedPercentage;
    protected ArrayList<BinaryChapter> chapters;

    public BinaryForm(String name,ArrayList<BinaryChapter> chapters){
        this.name = name;
        this.chapters = new ArrayList<>();
        totalPoints = 0;
        achievedPercentage = 0f;
        achievedPoints = 0;
        addChapters(chapters);
        update();
    }
    protected void addChapters(ArrayList<BinaryChapter> chapters){
        if(chapters!=null) {
            for (BinaryChapter chapter : chapters) {
                addChapter(chapter);
            }
        }
    }
    public void addChapter(BinaryChapter chapter){
        chapter.setForm(this);
        chapters.add(chapter);
    }

    public ArrayList<BinaryChapter> getChapters(){
        return chapters;
    }
    public void update(){
        if(chapters!=null) {
            totalPoints = 0;
            achievedPercentage = 0f;
            achievedPoints = 0;
            for (BinaryChapter chapter : chapters) {
                totalPoints += chapter.getTotalPoints();
                achievedPercentage += chapter.getAchievedFormPercentage();
                achievedPoints += chapter.getAchievedPoints();
            }
        }
    }
    public String getName(){
        return name;
    }
    public int getAchievedPoints(){
        update();
        return achievedPoints;
    }
    public int getTotalPoints(){
        update();
        return totalPoints;
    }
    public float getAchievedPercentage(){
        update();
        return achievedPercentage;
    }

}
