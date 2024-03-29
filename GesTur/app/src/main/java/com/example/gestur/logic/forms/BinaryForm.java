package com.example.gestur.logic.forms;

import com.example.gestur.logic.chapters.BinaryChapter;

import java.io.Serializable;
import java.util.ArrayList;

public class BinaryForm extends Form {

    protected ArrayList<BinaryChapter> chapters;

    public BinaryForm(String name,int type,ArrayList<BinaryChapter> chapters){
        super(name,type);
        this.chapters = new ArrayList<>();
        totalPoints = 0;
        achievedPercentage = 0f;
        achievedPoints = 0;
        addChapters(chapters);
    }

    public void addChapters(ArrayList<BinaryChapter> chapters){
        if(chapters!=null) {
            for (BinaryChapter chapter : chapters) {
                addChapter(chapter);
            }
            update();
        }
    }
    public void addChapter(BinaryChapter chapter){
        if(chapter!=null){
            chapter.setForm(this);
            chapters.add(chapter);
        }
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
            achievedPercentage = (float)(Math.round(achievedPercentage*Math.pow(10,2)) / Math.pow(10,2));
        }
    }

}
