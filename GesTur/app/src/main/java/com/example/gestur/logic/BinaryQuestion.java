package com.example.gestur.logic;

public class BinaryQuestion{

    private String question;
    private int number;
    private Boolean yes;
    private Boolean no;
    private Boolean NA;
    private BinaryChapter chapter;

    public BinaryQuestion(String question,int number,boolean yes,boolean no, boolean NA){
        this.question = question;
        this.number = number;
        this.yes = yes;
        this.no = no;
        this.NA = NA;
    }
    public void setChapter(BinaryChapter chapter){
        this.chapter = chapter;
    }
    public BinaryChapter getChapter(){
        return chapter;
    }
    public boolean isYes(){
        return yes;
    }
    public boolean isNo(){
        return no;
    }
    public boolean isNA(){
        return NA;
    }
    public String getQuestion(){ return question; }
    public int getNumber(){ return number; }

    public void setYes(){
        yes = true;
        no = false;
        NA = false;
        chapter.update();
    }
    public void setNo(){
        yes = false;
        no = true;
        NA = false;
        chapter.update();
    }
    public void setNA(){
        yes = false;
        no = false;
        NA = true;
        chapter.update();
    }
    public void setNone(){
        yes = false;
        no = false;
        NA = false;
        chapter.update();
    }



}
