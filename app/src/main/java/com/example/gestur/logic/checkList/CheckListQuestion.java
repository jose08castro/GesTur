package com.example.gestur.logic.checkList;

import com.example.gestur.logic.checkList.CheckListForm;

public class CheckListQuestion {
    private String number;
    private String question;
    private Boolean isDone;
    private CheckListForm form;

    public CheckListQuestion(String number, String question, boolean isDone) {
        this.number = number;
        this.question = question;
        this.isDone = isDone;
    }
    public void setForm(CheckListForm form){
        this.form = form;
    }

    public String getNumber() {
        return number;
    }

    public String getQuestion() {
        return question;
    }

    public boolean isDone() {
        return isDone;
    }
    public void setDone(boolean done){
        isDone = done;
        form.update();
    }
}
