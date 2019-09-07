package com.example.gestur.logic.forms;

import com.example.gestur.logic.chapters.BinaryChapter;

import java.util.ArrayList;

public class ConCentersBinaryForm extends BinaryForm {

    private String establishmentName;
    private int eventRooms;
    private int places;
    private int collaborators;

    public ConCentersBinaryForm(String name, String establishment, int rooms, int places, int collaborators, ArrayList<BinaryChapter> chapters) {
        super(name, chapters);
        this.establishmentName = establishment;
        this.eventRooms = rooms;
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
    public void setEstablishmentName(String establishmentName) { this.establishmentName = establishmentName; }
    public int getEventRooms() {
        return eventRooms;
    }
    public void setEventRooms(int eventRooms) {
        this.eventRooms = eventRooms;
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
}
