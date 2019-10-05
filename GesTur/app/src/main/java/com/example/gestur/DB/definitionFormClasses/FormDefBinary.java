package com.example.gestur.DB.definitionFormClasses;

import java.util.ArrayList;

public class FormDefBinary {
    public String name;
    public int type;
    public int totalPoints;
    public int achievedPoints;
    public float achievedPercentage;

    public ArrayList<ChapterDefBinary> chapters;

    public FormDefBinary(){

    }
    public FormDefBinary(String name,int type,ArrayList<ChapterDefBinary> chapters){
        this.chapters = chapters;
        this.name = name;
        this.type = type;
        totalPoints = 0;
        achievedPoints = 0;
        achievedPercentage = 0f;
    }
}
