package com.example.gestur.logic;

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

    public String getEstablishmentName() {
        return establishmentName;
    }

    public void setEstablishmentName(String establishmentName) {
        this.establishmentName = establishmentName;
    }

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
