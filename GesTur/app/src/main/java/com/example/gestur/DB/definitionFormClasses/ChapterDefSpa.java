package com.example.gestur.DB.definitionFormClasses;

import java.util.ArrayList;

public class ChapterDefSpa {
    public String name;
    public String number;
    public float totalPercentage;
    public float achievedChapterPercentage;
    public float achievedFormPercentage;

    public int achievedPoints;
    public int totalPoints;
    public int applicablePoints;
    public int naPoints;
    public ArrayList<QuestionDefScoreObs> questionsScore;

    public ChapterDefSpa(){

    }
    public ChapterDefSpa(String name,String number,float totalPercentage,ArrayList<QuestionDefScoreObs> questionsScore){
        this.name = name;
        this.number = number;
        this.totalPercentage = totalPercentage;
        this.questionsScore = questionsScore;
        achievedChapterPercentage = 0f;
        achievedFormPercentage = 0f;
        achievedPoints = 0;
        totalPoints = 0;
        applicablePoints = 0;
        naPoints = 0;
    }
}
