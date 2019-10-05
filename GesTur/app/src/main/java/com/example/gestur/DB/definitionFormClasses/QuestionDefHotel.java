package com.example.gestur.DB.definitionFormClasses;

public class QuestionDefHotel extends Object{

    public String number;
    public String question;
    public Boolean NA;

    public int minScore;
    public int maxScore;
    public int score;

    public String question1Star;
    public String question2Star;
    public String question3Star;
    public String question4Star;
    public String question5Star;
    public int selectedQuestion;

    public QuestionDefHotel(){

    }

    public QuestionDefHotel(String number,String question,String question1Star,String question2Star,String question3Star,String question4Star,String question5Star){
        this.number = number;
        this.question = question;
        this.question1Star = question1Star;
        this.question2Star = question2Star;
        this.question3Star = question3Star;
        this.question4Star = question4Star;
        this.question5Star = question5Star;
        NA = false;
        minScore = 1;
        maxScore = 5;
        score = 1;
        selectedQuestion = 1;
    }
}
