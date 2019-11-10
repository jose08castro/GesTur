package com.example.gestur.logic.chapters;

import com.example.gestur.logic.forms.Form;

public abstract class Chapter implements IChapter {

    protected Form form;
    protected String name;
    protected String number;
    protected float totalPercentage;
    protected float achievedChapterPercentage;
    protected float achievedFormPercentage;

    public Chapter(String name, String number, float totalPercentage){
        this.name = name;
        this.number = number;
        this.totalPercentage = totalPercentage;
        achievedChapterPercentage = 0f;
        achievedFormPercentage = 0f;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }
    public float getTotalPercentage(){
        return totalPercentage;
    }
    public float getAchievedChapterPercentage(){
        return achievedChapterPercentage;
    }
    public float getAchievedFormPercentage(){
        return achievedFormPercentage;
    }
    public abstract int getTotalPoints();

    public abstract int getTotalQuestions();
}
