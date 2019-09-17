package com.example.gestur.logic.questions;

public abstract class Question {

    protected String number;
    protected String question;
    protected Boolean NA;

    public Question(String number,String question,Boolean NA){
        this.number = number;
        this.question = question;
        this.NA = NA;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isNA(){
        return NA;
    }

    public void setNA(Boolean NA) {
        this.NA = NA;
    }
}
