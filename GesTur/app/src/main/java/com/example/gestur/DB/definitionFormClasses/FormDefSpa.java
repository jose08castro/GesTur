package com.example.gestur.DB.definitionFormClasses;

import java.util.ArrayList;

public class FormDefSpa {
    public String name;
    public int type;
    public int totalPoints;
    public int achievedPoints;
    public float achievedPercentage;
    public int applicablePoints;
    public int NApoints;
    public ArrayList<ChapterDefSpa> chapters;

    public String establishmentName;
    public int collaborators;
    public String typology;
    public int rooms;

    public FormDefSpa(){

    }

    public FormDefSpa(String name,int type,ArrayList<ChapterDefSpa> chapters){
        this.name = name;
        this.type = type;
        this.chapters = chapters;
        this.establishmentName = "";
        this.collaborators = 0;
        this.typology = "";
        this.rooms = 0;
        achievedPercentage = 0f;
        achievedPoints = 0;
        applicablePoints = 0;
        NApoints = 0;
    }
}
