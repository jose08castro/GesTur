package com.example.gestur.logic.forms;

import com.example.gestur.logic.chapters.ScoreChapter;

import java.util.ArrayList;

public class CafeteriaFondaSodaForm extends ScoreForm{

    private String establishmentName;
    private int tables;
    private int places;
    private int collaborators;
    private String type;

    public CafeteriaFondaSodaForm(String establishmentName, int tables, int places, int collabs, String name, ArrayList<ScoreChapter> chapters,String type) {
        super(name, chapters);
        this.establishmentName = establishmentName;
        this.tables = tables;
        this.places = places;
        this.collaborators = collabs;
        this.type = type;
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
