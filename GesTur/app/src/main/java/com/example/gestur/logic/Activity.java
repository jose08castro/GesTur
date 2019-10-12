package com.example.gestur.logic;

import com.example.gestur.DB.ActivityDummy;
import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.logic.forms.Form;

public class Activity {

    private String name;
    private Address location;
    private Boolean isOperative;
    private int type;
    private Form form;
    private CheckListForm checkListForm;

    public Activity(String name, Address location, Boolean isOperative,int type) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.isOperative = isOperative;
    }
    public Activity(String name, Address location, Boolean isOperative,int type,Form form,CheckListForm checkListForm) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.isOperative = isOperative;
        this.form = form;
        this.checkListForm = checkListForm;
    }
    public Form getForm(){
        return form;
    }

    public int getType() {
        return type;
    }

    public void setForm(Form form){
        this.form = form;
    }
    public void setCheckListForm(CheckListForm form){
        this.checkListForm = form;
    }
    public CheckListForm getCheckListForm(){
        return checkListForm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public Boolean isOperative() {
        return isOperative;
    }

    public void setOperative(Boolean operative) {
        isOperative = operative;
    }

}
