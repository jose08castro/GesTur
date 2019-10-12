package com.example.gestur.DB.definitionFormClasses;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.forms.RestaurantBinaryForm;

import java.util.ArrayList;

public class FormDefRestaurant {

    public String name;
    public int type;
    public int totalPoints;
    public int achievedPoints;
    public float achievedPercentage;

    public ArrayList<ChapterDefBinary> chapters;
    public ArrayList<String> chapterNames;

    public String establishmentName;
    public String specialty;
    public int tables;
    public int places;
    public int collaborators;
    public String schedule;

    public FormDefRestaurant(){

    }
    public FormDefRestaurant(String name,int type,ArrayList<ChapterDefBinary> chapters,ArrayList<String> chapterNames){
        this.name = name;
        this.type = type;
        this.chapters = chapters;
        this.chapterNames = chapterNames;
        this.establishmentName = "";
        this.specialty = "";
        this.tables = 0;
        this.places = 0;
        this.collaborators = 0;
        this.schedule = "";
    }
}
