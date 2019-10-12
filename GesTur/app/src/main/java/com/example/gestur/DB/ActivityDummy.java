package com.example.gestur.DB;

import com.example.gestur.DB.definitionCheckListClasses.CheckListDef;
import com.example.gestur.DB.definitionFormClasses.FormDefBinary;
import com.example.gestur.DB.definitionFormClasses.FormDefCafeteriaFondaSoda;
import com.example.gestur.DB.definitionFormClasses.FormDefConCenters;
import com.example.gestur.DB.definitionFormClasses.FormDefHotel;
import com.example.gestur.DB.definitionFormClasses.FormDefRestaurant;
import com.example.gestur.DB.definitionFormClasses.FormDefSpa;
import com.example.gestur.logic.checkList.CheckListForm;

public class ActivityDummy {
    public String name;
    public String province;
    public String canton;
    public String district;
    public String address;
    public int type;
    public boolean isOperative;

    public CheckListDef checkListDef;

    public FormDefBinary formDefBinary;
    public FormDefConCenters formDefConCenters;
    public FormDefCafeteriaFondaSoda formDefCafeteriaFondaSoda;
    public FormDefHotel formDefHotel;
    public FormDefRestaurant formDefRestaurant;
    public FormDefSpa formDefSpa;

    public ActivityDummy(){

    }
}
