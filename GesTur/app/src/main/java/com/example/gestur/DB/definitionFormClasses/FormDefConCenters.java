package com.example.gestur.DB.definitionFormClasses;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.forms.ConCentersBinaryForm;

import java.util.ArrayList;

public class FormDefConCenters {

    public String name;
    public int type;
    public int totalPoints;
    public int achievedPoints;
    public float achievedPercentage;
    public String establishmentName;
    public int eventRooms;
    public int places;
    public int collaborators;
    public ArrayList<ChapterDefBinary> chapters;
    public ArrayList<String> chapterNames;

    public FormDefConCenters(){

    }
    public FormDefConCenters(String name,int type,ArrayList<ChapterDefBinary> chapters,ArrayList<String> chapterNames){
        this.name = name;
        this.type = type;
        this.chapters = chapters;
        this.chapterNames = chapterNames;
        this.establishmentName = "";
        this.eventRooms = 0;
        this.places = 0;
        this.collaborators = 0;
        totalPoints = 0;
        achievedPoints = 0;
        achievedPercentage = 0f;
    }
}
