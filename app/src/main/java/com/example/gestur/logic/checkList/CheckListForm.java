package com.example.gestur.logic.checkList;

import java.util.ArrayList;

public class CheckListForm {

    private String enterpriseName;
    private String emailAddress;
    private String date;
    private String phoneNumber;
    private ArrayList<CheckListQuestion> questions;
    private int legalQuestions;
    private int techQuestions;
    private float achievedPercentage;

    public CheckListForm(String enterpriseName,
                         String emailAddress,
                         String date,
                         String phoneNumber,
                         int legalQuestions,
                         int techQuestions,
                         ArrayList<CheckListQuestion> questions) {
        this.enterpriseName = enterpriseName;
        this.emailAddress = emailAddress;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.legalQuestions = legalQuestions;
        this.techQuestions = techQuestions;
        this.achievedPercentage = 0f;
        this.questions = new ArrayList<>();
        addQuestions(questions);
        update();
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getDate() {
        return date;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<CheckListQuestion> getQuestions() {
        return questions;
    }

    public int getLegalQuestions() {
        return legalQuestions;
    }

    public int getTechQuestions() {
        return techQuestions;
    }

    public float getAchievedPercentage() {
        return achievedPercentage;
    }

    public void addQuestions(ArrayList<CheckListQuestion> quests){
        if(questions!=null){
            for(CheckListQuestion q :quests){
                addQuestion(q);
            }
        }
    }
    public void addQuestion(CheckListQuestion q){
        if(q!=null){
            q.setForm(this);
            questions.add(q);
        }
    }
    public void update(){
        int done = 0;
        int total = 0;
        for(CheckListQuestion q:questions){
            total++;
            if(q.isDone()){
                done++;
            }
        }
        if(total==0){
            achievedPercentage = 0f;
        }else{
            achievedPercentage = 100*(((float)done)/((float)total));
        }
    }

}
