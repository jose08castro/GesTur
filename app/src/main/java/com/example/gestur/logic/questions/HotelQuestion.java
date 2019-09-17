package com.example.gestur.logic.questions;

public class HotelQuestion extends ScoreQuestion {

    private String question1Star;
    private String question2Star;
    private String question3Star;
    private String question4Star;
    private String question5Star;
    private int selectedQuestion;

    public HotelQuestion(String number, String description, Boolean NA,String q1,String q2,String q3,String q4,String q5,int selection) {
        super(number, 1,5,description, NA,selection);
        this.question1Star = q1;
        this.question2Star = q2;
        this.question3Star = q3;
        this.question4Star = q4;
        this.question5Star = q5;
        selectedQuestion = selection;
    }

    public String getQuestion1Star() {
        return question1Star;
    }

    public void setQuestion1Star(String question1Star) {
        this.question1Star = question1Star;
    }

    public String getQuestion2Star() {
        return question2Star;
    }

    public void setQuestion2Star(String question2Star) {
        this.question2Star = question2Star;
    }

    public String getQuestion3Star() {
        return question3Star;
    }

    public void setQuestion3Star(String question3Star) {
        this.question3Star = question3Star;
    }

    public String getQuestion4Star() {
        return question4Star;
    }

    public void setQuestion4Star(String question4Star) {
        this.question4Star = question4Star;
    }

    public String getQuestion5Star() {
        return question5Star;
    }

    public void setQuestion5Star(String question5Star) {
        this.question5Star = question5Star;
    }

    public int getSelectedQuestion() {
        return selectedQuestion;
    }

    public void setSelectedQuestion(int selectedQuestion) {
        this.selectedQuestion = selectedQuestion;
    }
}
