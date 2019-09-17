package com.example.gestur.logic.forms;

import com.example.gestur.logic.chapters.ScoreChapter;

import java.util.ArrayList;

public class SpaForm extends ScoreForm{

    private String establishmentName;
    private int collaborators;
    private String typology;
    private int rooms;

    public SpaForm(String establishmentName,int collabs,String typology, int rooms,String name,int type, ArrayList<ScoreChapter> chapters) {
        super(name,type,chapters);
        this.establishmentName = establishmentName;
        this.collaborators = collabs;
        this.typology = typology;
        this.rooms = rooms;
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
}
