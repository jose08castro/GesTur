package com.example.gestur.logic.forms;

import com.example.gestur.logic.chapters.BinaryChapter;

import java.util.ArrayList;

public class RestaurantBinaryForm extends BinaryForm {

    private String establishmentName;
    private String specialty;
    private int tables;
    private int places;
    private int collaborators;
    private String schedule;

    public RestaurantBinaryForm(String name,int type,String establishment,String specialty,int tables,int places,int collaborators, ArrayList<BinaryChapter> chapters) {
        super(name,type,chapters);
        this.establishmentName = establishment;
        this.specialty = specialty;
        this.tables = tables;
        this.places = places;
        this.collaborators = collaborators;
    }
    @Override
    public void addChapters(ArrayList<BinaryChapter> chapters){
        if(chapters!=null) {
            for (BinaryChapter chapter : chapters) {
                addChapter(chapter);
            }
        }
    }
    @Override
    public void addChapter(BinaryChapter chapter){
        if(chapter!=null){
            chapter.setForm(this);
            chapters.add(chapter);
        }
    }


    public String getEstablishmentName() {
        return establishmentName;
    }

    public void setEstablishmentName(String establishmentName) {
        this.establishmentName = establishmentName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public int getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(int collaborators) {
        this.collaborators = collaborators;
    }

    public void setSchedule(String schedule){
        this.schedule = schedule;
    }
    public String getSchedule(){
        return schedule;
    }
}
