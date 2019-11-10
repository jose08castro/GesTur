package com.example.gestur.logic.chapters;

import com.example.gestur.logic.questions.BinaryQuestion;
import com.example.gestur.logic.forms.BinaryForm;

import java.io.Serializable;
import java.util.ArrayList;

public class BinaryChapter extends Chapter implements Serializable {

    private ArrayList<BinaryQuestion> questions;
    private int yesQuestions;
    private int noQuestions;
    private int NAQuestions;

    public BinaryChapter(String name,String num, ArrayList<BinaryQuestion> questions, float percentage){
        super(name,num,percentage);
        yesQuestions = 0;
        noQuestions = 0;
        NAQuestions = 0;
        form = null;
        this.questions = new ArrayList<>();
        addQuestions(questions);
    }
    public void addQuestions(ArrayList<BinaryQuestion> questions){
        if(questions!=null) {
            for (BinaryQuestion question : questions) {
                addQuestion(question);
            }
            updateOnCreate();
        }
    }
    public BinaryForm getForm(){
        return (BinaryForm) form;
    }
    public void addQuestion(BinaryQuestion question){
        question.setChapter(this);
        questions.add(question);
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


    public int getTotalQuestions(){return questions.size();}
    public int getYesQuestions(){return yesQuestions;}
    public int getNoQuestions(){return noQuestions;}
    public int getNAQuestions(){return NAQuestions;}



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
