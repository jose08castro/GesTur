package com.example.gestur.DB.definitionCheckListClasses;

import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.logic.checkList.CheckListQuestion;

import java.util.ArrayList;

public class CheckListDef {

    public String name;
    public String enterprise;
    public String emailAddress;
    public String date;
    public String phoneNumber;
    public ArrayList<CheckListQuestionDef> questionsLegal;
    public ArrayList<CheckListQuestionDef> questionsTech;
    public float achievedPercentage;

    public CheckListDef(){

    }
    public CheckListDef(String name,ArrayList<CheckListQuestionDef> questionsLegal,ArrayList<CheckListQuestionDef> questionsTech){
        this.name = name;
        this.questionsLegal = questionsLegal;
        this.questionsTech = questionsTech;
        enterprise = "";
        emailAddress = "";
        date = "";
        phoneNumber = "";
        achievedPercentage = 0f;
    }
}
