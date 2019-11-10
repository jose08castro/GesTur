package com.example.gestur.logic.forms;

import com.example.gestur.logic.chapters.ScoreChapter;

import java.util.ArrayList;

public class SpaForm extends ScoreForm{

    private String establishmentName;
    private int collaborators;
    private String typology;
    private int rooms;
    private ArrayList<String> typologies;

    public SpaForm(String establishmentName,int collabs,String typology, int rooms,String name,int type, ArrayList<ScoreChapter> chapters) {
        super(name,type,chapters);
        this.establishmentName = establishmentName;
        this.collaborators = collabs;
        this.typology = typology;
        this.rooms = rooms;
        loadTypologies();
    }

    public String getEstablishmentName() {
        return establishmentName;
    }

    public int getCollaborators() {
        return collaborators;
    }

    public String getTypology() {
        return typology;
    }

    public int getRooms() {
        return rooms;
    }

    public ArrayList<String> getTypologies() {
        return typologies;
    }

    private void loadTypologies(){
        typologies = new ArrayList<>();
        typologies.add("Urbano");
        typologies.add("Playa");
        typologies.add("Montaña");
        typologies.add("Termomineral");
        typologies.add("Mixto");
    }
    @Override
    public void addChapters(ArrayList<ScoreChapter> chapters){
        if(chapters!=null) {
            for (ScoreChapter chapter : chapters) {
                addChapter(chapter);
            }
        }
    }
    @Override
    public void addChapter(ScoreChapter chapter){
        if(chapter!=null) {
            chapter.setForm(this);
            chapters.add(chapter);
        }
    }

    public void setEstablishmentName(String establishmentName) {
        this.establishmentName = establishmentName;
    }

    public void setCollaborators(int collaborators) {
        this.collaborators = collaborators;
    }

    public void setTypology(String typology) {
        this.typology = typology;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}
