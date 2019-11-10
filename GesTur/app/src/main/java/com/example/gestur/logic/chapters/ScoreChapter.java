package com.example.gestur.logic.chapters;

import com.example.gestur.logic.questions.IScoreQuestion;
import com.example.gestur.logic.questions.ScoreObsQuestion;
import com.example.gestur.logic.questions.ScoreQuestion;
import com.example.gestur.logic.forms.ScoreForm;

import java.util.ArrayList;

public class ScoreChapter extends Chapter{

    private ArrayList<ScoreQuestion> questions;
    private int achievedPoints;
    private int totalPoints;
    private int applicablePoints;
    private int naPoints;

    public ScoreChapter(String num, String name, ArrayList<ScoreQuestion> questions, float totalPercentage){
        super(name,num,totalPercentage);
        this.questions = new ArrayList<>();
        form = null;
        addQuestions(questions);

    }
    public void updateOnCreate(){
        updateTotals();
        updatePercentages();
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
        return (ScoreForm) form;
    }
    public void setForm(ScoreForm form) {
        this.form = form;
    }
    public void addQuestions(ArrayList<ScoreQuestion> quests){
        if(quests!=null) {
            for (ScoreQuestion quest : quests) {
                addQuestion(quest);
            }
            updateOnCreate();
        }
    }
    public void addQuestion(ScoreQuestion quest){
        quest.setChapter(this);
        questions.add(quest);
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ScoreQuestion> getQuestions() {
        return questions;
    }

    public int getAchievedChapterPoints() {
        return achievedPoints;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    @Override
    public int getTotalQuestions() {
        if(questions!=null){
            return questions.size();
        }else{
            return 0;
        }
    }

    public int getApplicablePoints(){
        return applicablePoints;
    }

    public int getNaPoints(){
        return naPoints;
    }
}
