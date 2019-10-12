package com.example.gestur.logic.forms;

import com.example.gestur.logic.chapters.Chapter;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Form implements IForm, Serializable {

    protected String name;
    protected int type;
    protected int totalPoints;
    protected int achievedPoints;
    protected float achievedPercentage;

    public Form(String name,int type){
        this.name = name;
        this.type = type;
    }
    public int getType(){
        return type;
    }
    public void setType(int type){
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getAchievedPoints() {
        return achievedPoints;
    }

    public void setAchievedPoints(int achievedPoints) {
        this.achievedPoints = achievedPoints;
    }

    public float getAchievedPercentage() {
        return achievedPercentage;
    }

    public void setAchievedPercentage(float achievedPercentage) {
        this.achievedPercentage = achievedPercentage;
    }
}
