package com.example.gestur.logic;

public class ScoreQuestion {

    private short minScore;
    private short maxScore;
    private String question;
    private Boolean NA;
    private ScoreChapter chapter;
    private short score;

    public ScoreQuestion(short min, short max, String question){
        minScore = min;
        maxScore = max;
        this.question = question;
        NA = false;
        score = 0;
    }

    public short getScore() {
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
    public String getQuestion()
    {
        return question;
    }
    public Boolean isNA()
    {
        return NA;
    }
    public void setNA(Boolean bool){
        NA = bool;
        chapter.update();
    }
}
