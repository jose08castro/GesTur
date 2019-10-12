package com.example.gestur.logic.checkList;

import com.example.gestur.DB.definitionCheckListClasses.CheckListQuestionDef;
import com.example.gestur.logic.checkList.CheckListForm;

public class CheckListQuestion {
    private String question;
    private boolean yes;
    private boolean no;
    private CheckListForm form;

    public CheckListQuestion(String question, boolean yes,boolean no) {
        this.question = question;
        this.yes = yes;
        this.no = no;
    }
    public void setForm(CheckListForm form){
        this.form = form;
    }

    public String getQuestion() {
        return question;
    }

    public boolean isDone() {
        return yes;
    }
    public void setDone(boolean done){
        yes = done;
        no = !done;
        form.update();
    }

    public boolean isYes() {
        return yes;
    }

    public boolean isNo() {
        return no;
    }
}
