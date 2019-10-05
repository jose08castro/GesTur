package com.example.gestur.DB.definitionFormClasses;

import java.util.ArrayList;

public class FormDefRestaurant {

    public String name;
    public int type;
    public int totalPoints;
    public int achievedPoints;
    public float achievedPercentage;

    public ArrayList<ChapterDefBinary> chapters;

    public String establishmentName;
    public String specialty;
    public int tables;
    public int places;
    public int collaborators;
    public String schedule;

    public FormDefRestaurant(){

    }
    public FormDefRestaurant(String name,int type,ArrayList<ChapterDefBinary> chapters,String establishmentName,
                             String specialty,int tables,int places,int collaborators,String schedule){
        this.name = name;
        this.type = type;
        this.chapters = chapters;
        this.establishmentName = establishmentName;
        this.specialty = specialty;
        this.tables = tables;
        this.places = places;
        this.collaborators = collaborators;
        this.schedule = schedule;
    }

}
