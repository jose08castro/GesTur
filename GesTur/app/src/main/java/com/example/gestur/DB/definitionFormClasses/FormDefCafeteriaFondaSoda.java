package com.example.gestur.DB.definitionFormClasses;

import com.example.gestur.logic.chapters.ScoreChapter;
import com.example.gestur.logic.forms.CafeteriaFondaSodaForm;
import com.example.gestur.logic.forms.ScoreForm;

import java.util.ArrayList;

public class FormDefCafeteriaFondaSoda {

    public String name;
    public int type;
    public int totalPoints;
    public int achievedPoints;
    public float achievedPercentage;

    public int applicablePoints;
    public int NApoints;
    public ArrayList<ChapterDefScore> chapters;

    public String establishmentName;
    public int tables;
    public int places;
    public int collaborators;
    public String placeType;

    public FormDefCafeteriaFondaSoda(){

    }
    public FormDefCafeteriaFondaSoda(String name,int type,ArrayList<ChapterDefScore> chapters){
        this.name = name;
        this.type = type;
        this.chapters = chapters;
        this.establishmentName = "";
        this.tables = 0;
        this.places = 0;
        this.collaborators = 0;
        this.placeType = "";
        achievedPoints = 0;
        achievedPercentage = 0f;
        applicablePoints = 0;
        NApoints = 0;
    }
}
