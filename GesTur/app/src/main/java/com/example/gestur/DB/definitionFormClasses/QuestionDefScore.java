package com.example.gestur.DB.definitionFormClasses;

import com.example.gestur.logic.questions.ScoreQuestion;

public class QuestionDefScore extends Object{

    public String number;
    public String question;
    public Boolean NA;
    public int minScore;
    public int maxScore;
    public int score;

    public QuestionDefScore(){

    }
    public QuestionDefScore(String number,String question,int minScore,int maxScore){
        this.number = number;
        this.question = question;
        this.minScore = minScore;
        this.maxScore = maxScore;
        NA = false;
        score = minScore;
    }

}
