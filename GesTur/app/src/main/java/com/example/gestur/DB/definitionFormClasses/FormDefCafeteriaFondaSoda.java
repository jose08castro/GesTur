package com.example.gestur.DB.definitionFormClasses;

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
    public FormDefCafeteriaFondaSoda(String name,int type,ArrayList<ChapterDefScore> chapters,String establishmentName,int tables,int places,int collaborators,String placeType){
        this.name = name;
        this.type = type;
        this.chapters = chapters;
        this.establishmentName = establishmentName;
        this.tables = tables;
        this.places = places;
        this.collaborators = collaborators;
        this.placeType = placeType;
        achievedPoints = 0;
        achievedPercentage = 0f;
        applicablePoints = 0;
        NApoints = 0;
    }
}
