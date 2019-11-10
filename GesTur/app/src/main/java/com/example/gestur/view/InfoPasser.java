package com.example.gestur.view;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.chapters.Chapter;
import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.logic.forms.ConCentersBinaryForm;
import com.example.gestur.logic.forms.Form;

public class InfoPasser {

    private Form form;
    private Chapter currentChapter;

    private CheckListForm checkListForm;

    private static InfoPasser infoPasser = new InfoPasser();

    private InfoPasser(){
        form = null;
        checkListForm = null;
        currentChapter = null;
    }
    public static  InfoPasser getInstance(){
        return infoPasser;
    }

    public void setCurrentChapter(Chapter chapter){
        currentChapter = chapter;
    }

    public Chapter getCurrentChapter(){
        return currentChapter;
    }

    public void setCurrentForm(Form form)
    {
        this.form = form;
    }

    public void setCurrentCheckListForm(CheckListForm form){
        this.checkListForm = form;
    }

    public Form getCurrentForm(){
        return form;
    }

    public CheckListForm getCurrentCheckListForm(){
        return checkListForm;
    }
}
