package com.example.gestur.logic;

import com.example.gestur.logic.forms.BinaryForm;
import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.logic.forms.Form;

public class FormFactory {

    static String name1 = "CALIFICACION DE ACTIVIDADES TURISTICAS TEMATICAS";
    static String name2 = "MANUAL DE HOTELES";
    static String name3 = "CALIFICACION PARA AGENCIAS DE VIAJES";
    static String name4 = "CALIFICACION PARA ALQUILER DE AUTOMOVILES,CUADRACICLOS,MOTOCICLETAS";
    static String name5 = "CALIFICACION PARA LINEAS AEREAS";
    static String name6 = "CALIFICACION PARA TRANSPORTE ACUATICO Y TOURS";
    static String name7 = "CALIFICACION DE CENTROS DE CONGRESOS Y CONVENCIONES";
    static String name8 = "Calificación Empresa Organizadora de Congresos y Convenciones";
    static String name9 = "Calificación de Restaurantes";
    static String name10 = "Calificación para Fondas y Sodas ";
    static String name11 = "Calificación para Cafeterías";
    static String name12 = "Calificación para Actividades Recreativas Acuáticas";
    static String name13 = "Calificación Actividades Recreativas Aéreas";
    static String name14 = "Calificación de Spa";

    public static CheckListForm getCheckList(){
        //DB.requestForm(type)
        return new CheckListForm("","","","","",0,0,null);
    }

    public static Form getForm(int type){
        switch (type){
            case 1:
                //DB.requestForm(type)
                return new BinaryForm(name1,type,null);
            case 2:
                //DB.requestForm(type)
                return new BinaryForm(name1,1,null);
            case 3:
                //...
                return new BinaryForm(name1,1,null);
            case 4:
                return new BinaryForm(name1,1,null);
            case 5:
                return new BinaryForm(name1,1,null);
            case 6:
                return new BinaryForm(name1,1,null);
            case 7:
                return new BinaryForm(name1,1,null);
            case 8:
                return new BinaryForm(name1,1,null);
            case 9:
                return new BinaryForm(name1,1,null);
            case 10:
                return new BinaryForm(name1,1,null);
            case 11:
                return new BinaryForm(name1,1,null);
            case 12:
                return new BinaryForm(name1,1,null);
            case 13:
                return new BinaryForm(name1,1,null);
            case 14:
                return new BinaryForm(name1,1,null);
            default:
                return null;
        }
    }
}
