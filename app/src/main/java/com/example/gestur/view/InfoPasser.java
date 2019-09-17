package com.example.gestur.view;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.logic.forms.ConCentersBinaryForm;

public class InfoPasser {

    private BinaryForm currentForm;
    private BinaryChapter currentChapter;
    private ConCentersBinaryForm conCentersBinaryForm;

    private static InfoPasser infoPasser = new InfoPasser();

    private InfoPasser(){
        conCentersBinaryForm = null;
        currentForm = null;
        currentChapter = null;
    }
    public static  InfoPasser getInstance(){
        return infoPasser;
    }

    public void setCurrentChapter(BinaryChapter chapter){
        currentChapter = chapter;
    }

    public BinaryChapter getCurrentChapter(){
        return currentChapter;
    }

    public void setCurrentForm(BinaryForm form)
    {
        currentForm = form;
    }

    public BinaryForm getCurrentForm(){
        return currentForm;
    }
}
