package com.example.gestur.DB.definitionCheckListClasses;

import com.example.gestur.logic.checkList.CheckListQuestion;

public class CheckListQuestionDef {

    public String question;
    public boolean yes;
    public boolean no;

    public CheckListQuestionDef(){

    }
    public CheckListQuestionDef(String question){
        this.question = question;
        yes = false;
        no = false;
    }
}
