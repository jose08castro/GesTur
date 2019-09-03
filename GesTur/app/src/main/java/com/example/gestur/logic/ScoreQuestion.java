package com.example.gestur.logic;

public class ScoreQuestion {

    public int minScore;
    public int maxScore;
    public String question;
    public Boolean applies;

    public ScoreQuestion(int min, int max, String question){
        minScore = min;
        maxScore = max;
        this.question = question;
        applies = true;
    }
    public int getMinScore(){
        return minScore;
    }
    public int getMaxScore(){
        return maxScore;
    }
    public String getQuestion(){
        return question;
    }
    public Boolean getApplies(){
        return applies;
    }
}
