package com.example.gestur.DB.definitionFormClasses;

import java.util.ArrayList;

public class FormDefScore {

    public String name;
    public int type;
    public int totalPoints;
    public int achievedPoints;
    public float achievedPercentage;
    public int applicablePoints;
    public int NApoints;
    public ArrayList<ChapterDefScore> chapters;

    public FormDefScore(){

    }
    public FormDefScore(String name,int type,ArrayList<ChapterDefScore> chapters){
        this.name = name;
        this.type = type;
        this.chapters = chapters;
        totalPoints = 0;
        achievedPoints = 0;
        achievedPercentage = 0;
        applicablePoints = 0;
        NApoints = 0;
    }
}
