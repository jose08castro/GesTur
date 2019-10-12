package com.example.gestur.logic.questions;

import com.example.gestur.DB.definitionFormClasses.QuestionDefBinary;
import com.example.gestur.logic.chapters.BinaryChapter;

import java.io.Serializable;

public class BinaryQuestion extends Question implements Serializable {

    private Boolean yes;
    private Boolean no;
    private BinaryChapter chapter;

    public BinaryQuestion(String question,String number,boolean yes,boolean no, boolean NA){
        super(number,question,NA);
        this.yes = yes;
        this.no = no;
    }
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
}
