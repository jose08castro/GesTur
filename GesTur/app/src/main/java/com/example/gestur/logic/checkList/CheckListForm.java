package com.example.gestur.logic.checkList;

import com.example.gestur.DB.definitionCheckListClasses.CheckListDef;
import com.example.gestur.DB.definitionCheckListClasses.CheckListQuestionDef;

import java.util.ArrayList;

public class CheckListForm {

    private String titleForm;
    private String enterpriseName;
    private String emailAddress;
    private String date;
    private String phoneNumber;
    private ArrayList<CheckListQuestion> questionsLegal;
    private ArrayList<CheckListQuestion> questionsTech;
    private float achievedPercentage;
    private int type;

    public CheckListForm(String titleForm,int type,String enterpriseName, String emailAddress,
                         String date,String phoneNumber,ArrayList<CheckListQuestion> questionsLegal,
                         ArrayList<CheckListQuestion> questionsTech) {
        this.titleForm = titleForm;
        this.type = type;
        this.enterpriseName = enterpriseName;
        this.emailAddress = emailAddress;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.achievedPercentage = 0f;
        this.questionsLegal = new ArrayList<>();
        this.questionsTech = new ArrayList<>();
        addQuestions(questionsLegal,1);
        addQuestions(questionsTech,2);
        update();
    }

    public int getType(){
        return type;
    }
    public String getTitleForm(){
        return titleForm;
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

    public ArrayList<CheckListQuestion> getQuestionsLegal() {
        return questionsLegal;
    }

    public ArrayList<CheckListQuestion> getQuestionsTech() {
        return questionsTech;
    }

    public float getAchievedPercentage() {
        return achievedPercentage;
    }

    public void addQuestions(ArrayList<CheckListQuestion> quests, int i){
        if(quests!=null){
            for(CheckListQuestion q :quests){
                addQuestion(q,i);
            }
        }
    }
    public void addQuestion(CheckListQuestion q,int i){
        if(q!=null){
            q.setForm(this);
            if(i == 1){
                questionsLegal.add(q);
            }else{
                questionsTech.add(q);
            }
        }
    }
    public void update(){
        int done = 0;
        int total = 0;
        for(CheckListQuestion q:questionsLegal){
            total++;
            if(q.isDone()){
                done++;
            }
        }
        for(CheckListQuestion q:questionsTech){
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
