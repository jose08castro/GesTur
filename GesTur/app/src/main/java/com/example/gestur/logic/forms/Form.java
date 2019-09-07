package com.example.gestur.logic.forms;

import com.example.gestur.logic.chapters.Chapter;

import java.util.ArrayList;

public abstract class Form implements IForm{

    protected String name;
    protected int totalPoints;
    protected int achievedPoints;
    protected float achievedPercentage;

    public Form(String name){
        this.name = name;
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
