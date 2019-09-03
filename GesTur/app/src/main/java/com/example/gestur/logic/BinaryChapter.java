package com.example.gestur.logic;

import com.example.gestur.logic.forms.BinaryForm;

import java.util.ArrayList;

public class BinaryChapter{

    private int number;
    private String name;
    private ArrayList<BinaryQuestion> questions;
    private int totalPercentage;
    private int yesQuestions;
    private int noQuestions;
    private int NAQuestions;
    private float achievedChapterPercentage;
    private float achievedFormPercentage;
    private BinaryForm form;

    public BinaryChapter(String name,int num, ArrayList<BinaryQuestion> questions, int percentage){
        this.name = name;
        number = num;
        totalPercentage = percentage;
        yesQuestions = 0;
        noQuestions = 0;
        NAQuestions = 0;
        achievedChapterPercentage = 0f;
        achievedFormPercentage = 0f;
        form = null;
        this.questions = new ArrayList<>();
        addQuestions(questions);
    }
    public void addQuestions(ArrayList<BinaryQuestion> questions){
        if(questions!=null) {
            for (BinaryQuestion question : questions) {
                addQuestion(question);
            }
        }
    }
    public void setForm(BinaryForm form){
        this.form = form;
    }
    public BinaryForm getForm(){
        return form;
    }
    public void addQuestion(BinaryQuestion question){
        question.setChapter(this);
        questions.add(question);
    }
    public void update(){
        updateTotals();
        updatePercentages();
        form.update();
    }
    private void updatePercentages(){
        float value1;
        float value2;
        if(getTotalPoints()==0){
            achievedFormPercentage = totalPercentage;
            achievedChapterPercentage = 100;
        } else{
            value1 = 100*((float)yesQuestions/(float)getTotalPoints());
            value2 = (float)totalPercentage*((float)yesQuestions/(float)getTotalPoints());
            achievedChapterPercentage = (float) (Math.round(value1 * Math.pow(10, 2)) / Math.pow(10, 2));
            achievedFormPercentage = (float) (Math.round(value2*Math.pow(10,2)) / Math.pow(10,2));
        }
    }
    private void updateTotals(){
        yesQuestions = 0;
        noQuestions = 0;
        NAQuestions = 0;
        for(BinaryQuestion question: questions){
            if(question.isYes()){
                yesQuestions++;
            }else if(question.isNo()){
                noQuestions++;
            } else if(question.isNA()){
                NAQuestions++;
            }
        }
    }
    public String getName(){ return name; }
    public int getNumber(){ return number; }
    public int getTotalQuestions(){return questions.size();}
    public int getYesQuestions(){return yesQuestions;}
    public int getNoQuestions(){return noQuestions;}
    public int getNAQuestions(){return NAQuestions;}
    public int getTotalPercentage(){return totalPercentage;}
    public float getAchievedChapterPercentage(){return achievedChapterPercentage;}
    public float getAchievedFormPercentage(){return achievedFormPercentage;}
    public ArrayList<BinaryQuestion> getQuestions(){ return questions; }
    public int getTotalPoints(){
        if(questions!=null){
            int count = questions.size();
            for(BinaryQuestion question: questions){
                if(question.isNA()){
                    count--;
                }
            }
            return count;
        }else{
            return 0;
        }
    }
    public int getAchievedPoints(){
        if(questions!=null){
            int count = 0;
            for(BinaryQuestion question: questions){
                if(question.isYes()){
                    count++;
                }
            }
            return count;
        }else{
            return 0;
        }
    }
}
