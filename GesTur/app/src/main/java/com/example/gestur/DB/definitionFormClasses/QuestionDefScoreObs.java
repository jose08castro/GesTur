package com.example.gestur.DB.definitionFormClasses;

public class QuestionDefScoreObs {
    public String number;
    public String question;
    public Boolean NA;
    public int minScore;
    public int maxScore;
    public int score;
    public String observation;

    public QuestionDefScoreObs(){

    }
    public QuestionDefScoreObs(String number,String question){
        this.number = number;
        this.question = question;
        this.minScore = 0;
        this.maxScore = 3;
        this.observation = "";
        NA = false;
        score = minScore;
    }
}
