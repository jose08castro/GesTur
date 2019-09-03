package com.example.gestur.logic;

import com.example.gestur.logic.forms.ScoreForm;

import java.util.ArrayList;

public class ScoreChapter {

    private ScoreForm form;
    private String number;
    private String name;
    private ArrayList<ScoreQuestion> questions;
    private float totalPercentage;
    private int achievedPoints;
    private int totalPoints;
    private int applicablePoints;
    private int naPoints;
    private float achievedChapterPercentage;
    private float achievedFormPercentage;

    public ScoreChapter(String num, String name, ArrayList<ScoreQuestion> questions, float totalPercentage){
        number = num;
        this. name = name;
        this.questions = new ArrayList<>();
        this.totalPercentage = totalPercentage;
        form = null;
        addQuestions(questions);
        update();

    }
    public void update(){
        updateTotals();
        updatePercentages();
        form.update();
    }
    private void updateTotals(){
        achievedPoints = 0;
        totalPoints = 0;
        naPoints = 0;
        applicablePoints = 0;
        for(ScoreQuestion question:questions){
            totalPoints+=question.getMaxScore();
            if(!question.isNA()){
                achievedPoints+=question.getScore();
                applicablePoints+=question.getMaxScore();
            }else{
                naPoints+=question.getScore();
            }
        }
    }
    private void updatePercentages(){
        float value;
        float value1;
        float value2;
        if(getTotalPoints()==0){
            achievedFormPercentage = totalPercentage;
            achievedChapterPercentage = 100;
        } else{
            value = ((float)achievedPoints/(float)applicablePoints);
            value1 = 100*value;
            value2 = totalPercentage*value;
            achievedChapterPercentage = (float) (Math.round(value1 * Math.pow(10, 2)) / Math.pow(10, 2));
            achievedFormPercentage = (float) (Math.round(value2*Math.pow(10,2)) / Math.pow(10,2));
        }
    }
    public ScoreForm getForm() {
        return form;
    }
    public void setForm(ScoreForm form) {
        this.form = form;
    }
    public void addQuestions(ArrayList<ScoreQuestion> quests){
        if(quests!=null) {
            for (ScoreQuestion quest : quests) {
                addQuestion(quest);
            }
        }
    }
    public void addQuestion(ScoreQuestion quest){
        quest.setChapter(this);
        questions.add(quest);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ScoreQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<ScoreQuestion> questions) {
        this.questions = questions;
    }

    public float getTotalPercentage() {
        return totalPercentage;
    }

    public void setTotalPercentage(float totalPercentage) {
        this.totalPercentage = totalPercentage;
    }

    public int getAchievedChapterPoints() {
        return achievedPoints;
    }

    public void setAchievedPoints(int achievedChapterPoints) {
        this.achievedPoints = achievedChapterPoints;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalChapterPoints) {
        this.totalPoints = totalChapterPoints;
    }

    public float getAchievedPercentage() {
        return achievedChapterPercentage;
    }

    public void setAchievedChapterPercentage(float achievedChapterPercentage) {
        this.achievedChapterPercentage = achievedChapterPercentage;
    }

    public float getAchievedFormPercentage() {
        return achievedFormPercentage;
    }

    public void setAchievedFormPercentage(float achievedFormPercentage) {
        this.achievedFormPercentage = achievedFormPercentage;
    }
    public int getApplicablePoints(){
        return applicablePoints;
    }
    public int getNaPoints(){
        return naPoints;
    }
}
