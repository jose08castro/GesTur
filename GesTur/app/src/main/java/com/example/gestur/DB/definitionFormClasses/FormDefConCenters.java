package com.example.gestur.DB.definitionFormClasses;

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

    public FormDefConCenters(){

    }
    public FormDefConCenters(String name,int type,String establishmentName,int eventRooms,int places,int collaborators){
        this.name = name;
        this.type = type;
        this.establishmentName = establishmentName;
        this.eventRooms = eventRooms;
        this.places = places;
        this.collaborators = collaborators;
        totalPoints = 0;
        achievedPoints = 0;
        achievedPercentage = 0f;
    }
}
