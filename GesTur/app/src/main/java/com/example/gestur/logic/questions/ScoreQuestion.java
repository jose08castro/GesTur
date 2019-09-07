package com.example.gestur.logic.questions;

import com.example.gestur.logic.chapters.ScoreChapter;

public class ScoreQuestion extends Question{

    protected int minScore;
    protected int maxScore;
    protected ScoreChapter chapter;
    protected int score;

    public ScoreQuestion(String number,int min, int max, String question,Boolean NA,int score){
        super(number,question,NA);
        minScore = min;
        maxScore = max;
        this.score = score;
    }
    public int getScore() {
        return score;
    }

    public void setScore(short score) {
        this.score = score;
        chapter.update();
    }

    public void setChapter(ScoreChapter chapter){
        this.chapter = chapter;
    }
    public int getMinScore(){
        return minScore;
    }
    public int getMaxScore()
    {
        return maxScore;
    }


    public void setNA(Boolean bool){
        NA = bool;
        chapter.update();
    }
}
