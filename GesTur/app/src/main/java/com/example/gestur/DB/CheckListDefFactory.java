package com.example.gestur.DB;

import com.example.gestur.DB.definitionCheckListClasses.CheckListDef;
import com.example.gestur.DB.definitionCheckListClasses.CheckListQuestionDef;

import java.util.ArrayList;

public abstract class CheckListDefFactory {

    public static CheckListDef getCheckListTematic_Hotel(){

        String pregunta1 = "Presenta solicitud de declaratoria turística y declaración jurada de acuerdo al formulario para ese fin?";
        String pregunta2 = "Presenta copia de la patente municipal y del permiso de funcionamiento del Ministerio de Salud (operación)?";
        String pregunta3 = "Se encuentra al día con la CCSS, FODESAF e impuesto a las sociedades?";
        String pregunta4 = "Indica en forma clara en qué consiste la actividad, operación que realiza y descripción de infraestructura y servicios?";
        String pregunta5 = "Obtiene y mantiene una calificación de 20% (hospedaje) o de 80% (temática) según las herramientas del evaluación contenidas en el anexo único?";
        String pregunta6 = "Presenta cronograma de construcción (proyectos)?";

        ArrayList<CheckListQuestionDef> questionsLegal = new ArrayList<>();
        questionsLegal.add(new CheckListQuestionDef(pregunta1));

        ArrayList<CheckListQuestionDef> questionsTech = new ArrayList<>();
        questionsTech.add(new CheckListQuestionDef(pregunta2));
        questionsTech.add(new CheckListQuestionDef(pregunta3));
        questionsTech.add(new CheckListQuestionDef(pregunta4));
        questionsTech.add(new CheckListQuestionDef(pregunta5));
        questionsTech.add(new CheckListQuestionDef(pregunta6));

        return new CheckListDef("Actividad Tematica y Empresas de Hospedaje",1,questionsLegal,questionsTech);
    } //1 //READY

    public static CheckListDef getCheckListTematic_Hotel_IndianZone(){
        String pregunta1 = "Presenta solicitud de declaratoria turística y declaración jurada de acuerdo al formulario para ese fin?";
        String pregunta2 = "Presenta número, nombre, fecha y vigencia de la Ley o el Decreto Ejecutivo, que dio origen a la Reserva Indígena?";
        String pregunta3 = "Presenta certificación de personería jurídica de la Asociación de Desarrollo Integral o autoridad competente?";
        String pregunta4 = "Presenta autorización de la ADI para desarrollar y operar la actividad que solicita la Declaratoria Turística?";

        String pregunta5 = "Presenta copia de la patente municipal y del permiso de funcionamiento del Ministerio de Salud (operación)?";
        String pregunta6 = "Presenta croquis con delimitación física (medida y linderos) elaborado por el profesional correspondiente?";
        String pregunta7 = "Se encuentra al día con la CCSS, FODESAF e impuesto a las sociedades?";
        String pregunta8 = "Indica en forma clara en qué consiste la actividad, operación que realiza y descripción de infraestructura y servicios?";
        String pregunta9 = "Obtiene y mantiene una calificación de 20% (hospedaje) o de 80% (temática) según las herramientas del evaluación contenidas en el anexo único?";
        String pregunta10 = "Presenta cronograma de construcción (proyectos)?";


        ArrayList<CheckListQuestionDef> questionsLegal = new ArrayList<>();
        questionsLegal.add(new CheckListQuestionDef(pregunta1));
        questionsLegal.add(new CheckListQuestionDef(pregunta2));
        questionsLegal.add(new CheckListQuestionDef(pregunta3));
        questionsLegal.add(new CheckListQuestionDef(pregunta4));

        ArrayList<CheckListQuestionDef> questionsTech = new ArrayList<>();
        questionsTech.add(new CheckListQuestionDef(pregunta5));
        questionsTech.add(new CheckListQuestionDef(pregunta6));
        questionsTech.add(new CheckListQuestionDef(pregunta7));
        questionsTech.add(new CheckListQuestionDef(pregunta8));
        questionsTech.add(new CheckListQuestionDef(pregunta9));
        questionsTech.add(new CheckListQuestionDef(pregunta10));

        return new CheckListDef("Actividad Tematica y Empresas de Hospedaje en Zona Indigena",2,questionsLegal,questionsTech);
    }//2 READY

    public static CheckListDef getCheckListTravelAgency(){
        String pregunta1 = "Presenta solicitud de declaratoria turística y declaración jurada de acuerdo al formulario para ese fin?";

        String pregunta2 = "Presenta copia de la patente municipal y del permiso de funcionamiento del Ministerio de Salud (operación)?";
        String pregunta3 = "Se encuentra al día con la CCSS, FODESAF e impuesto a las sociedades?";
        String pregunta4 = "Indica en forma clara en qué consiste la actividad, operación que realiza y descripción de tours?";
        String pregunta5 = "Obtiene y mantiene una calificación de 80% según las herramientas del evaluación contenidas en el anexo único?";
        String pregunta6 = "Presenta certificación de estar inscrita ante el MEIC? (ventas a plazo).";
        String pregunta7 = "Carta de compromiso de que los guías que contrate en su operación deberán de tener el respectivo carnet al día";
        String pregunta8 = "Presenta 3 cartas de relaciones comerciales con empresas que tienen la Declaratoria Turística?";
        String pregunta9 = "Presenta cronograma de construcción (proyectos)?";


        ArrayList<CheckListQuestionDef> questionsLegal = new ArrayList<>();
        questionsLegal.add(new CheckListQuestionDef(pregunta1));

        ArrayList<CheckListQuestionDef> questionsTech = new ArrayList<>();
        questionsTech.add(new CheckListQuestionDef(pregunta2));
        questionsTech.add(new CheckListQuestionDef(pregunta3));
        questionsTech.add(new CheckListQuestionDef(pregunta4));
        questionsTech.add(new CheckListQuestionDef(pregunta5));
        questionsTech.add(new CheckListQuestionDef(pregunta6));
        questionsTech.add(new CheckListQuestionDef(pregunta7));
        questionsTech.add(new CheckListQuestionDef(pregunta8));
        questionsTech.add(new CheckListQuestionDef(pregunta9));

        return new CheckListDef("Agencia de Viajes",3,questionsLegal,questionsTech);
    }//3 READY

    public static CheckListDef getCheckListVehicleLease(){
        String pregunta1 = "Presenta solicitud de declaratoria turística y declaración jurada de acuerdo al formulario para ese fin?";

        String pregunta2 = "Presenta copia de la patente municipal y del permiso de funcionamiento del Ministerio de Salud (operación)";
        String pregunta3 = "Se encuentra al día con la CCSS, FODESAF e impuesto a las sociedades?";
        String pregunta4 = "Indica en forma clara en qué consiste la actividad, operación que realiza, infraestructura y equipo?";
        String pregunta5 = "Obtiene y mantiene una calificación de 80% según las herramientas del evaluación contenidas en el anexo único?";
        String pregunta6 = "Presenta cronograma de construcción (proyectos)?";

        ArrayList<CheckListQuestionDef> questionsLegal = new ArrayList<>();
        questionsLegal.add(new CheckListQuestionDef(pregunta1));

        ArrayList<CheckListQuestionDef> questionsTech = new ArrayList<>();
        questionsTech.add(new CheckListQuestionDef(pregunta2));
        questionsTech.add(new CheckListQuestionDef(pregunta3));
        questionsTech.add(new CheckListQuestionDef(pregunta4));
        questionsTech.add(new CheckListQuestionDef(pregunta5));
        questionsTech.add(new CheckListQuestionDef(pregunta6));

        return new CheckListDef("ARRENDADORA DE VEHÍCULOS (MOTOS-CUADRAS)",4,questionsLegal,questionsTech);
    }//4 READY

    public static CheckListDef getCheckListAirLine(){
        String pregunta1 = "Presenta solicitud de declaratoria turística y declaración jurada de acuerdo al formulario para ese fin?";
        String pregunta2 = "Presenta copia de la patente municipal y del permiso de funcionamiento del Ministerio de Salud (operación)";
        String pregunta3 = "Se encuentra al día con la CCSS, FODESAF e impuesto a las sociedades?";
        String pregunta4 = "Indica en forma clara en qué consiste la actividad, operación que realiza, infraestructura y equipo?";
        String pregunta5 = "Obtiene y mantiene una calificación de 80% según las herramientas del evaluación contenidas en el anexo único?";
        String pregunta6 = "Presenta certificación del Consejo Técnico de Aviación Civil?";
        String pregunta7 = "Presenta cronograma de construcción (proyectos)?";

        ArrayList<CheckListQuestionDef> questionsLegal = new ArrayList<>();
        questionsLegal.add(new CheckListQuestionDef(pregunta1));

        ArrayList<CheckListQuestionDef> questionsTech = new ArrayList<>();
        questionsTech.add(new CheckListQuestionDef(pregunta2));
        questionsTech.add(new CheckListQuestionDef(pregunta3));
        questionsTech.add(new CheckListQuestionDef(pregunta4));
        questionsTech.add(new CheckListQuestionDef(pregunta5));
        questionsTech.add(new CheckListQuestionDef(pregunta6));
        questionsTech.add(new CheckListQuestionDef(pregunta7));

        return new CheckListDef("Línea Aérea",5,questionsLegal,questionsTech);
    }//5 READY

    public static CheckListDef getCheckListWaterTransport(){
        String pregunta1 = "Presenta solicitud de declaratoria turística y declaración jurada de acuerdo al formulario para ese fin?";
        String pregunta2 = "Presenta copia de la patente municipal y del permiso de funcionamiento del Ministerio de Salud (operación)?";
        String pregunta3 = "Se encuentra al día con la CCSS, FODESAF e impuesto a las sociedades?";
        String pregunta4 = "Indica en forma clara en qué consiste la actividad, operación que realiza, infraestructura y equipo?";
        String pregunta5 = "Obtiene y mantiene una calificación de 80% según las herramientas del evaluación contenidas en el anexo único?";
        String pregunta6 = "Cuenta con un muelle u opción alterna que reúna las consiciones de seguridad necesarias para el turista?";
        String pregunta7 = "Presenta certificación de navegabilidad del MOPT?";
        String pregunta8 = "Presenta cronograma de construcción (proyectos)?";

        ArrayList<CheckListQuestionDef> questionsLegal = new ArrayList<>();
        questionsLegal.add(new CheckListQuestionDef(pregunta1));

        ArrayList<CheckListQuestionDef> questionsTech = new ArrayList<>();
        questionsTech.add(new CheckListQuestionDef(pregunta2));
        questionsTech.add(new CheckListQuestionDef(pregunta3));
        questionsTech.add(new CheckListQuestionDef(pregunta4));
        questionsTech.add(new CheckListQuestionDef(pregunta5));
        questionsTech.add(new CheckListQuestionDef(pregunta6));
        questionsTech.add(new CheckListQuestionDef(pregunta7));
        questionsTech.add(new CheckListQuestionDef(pregunta8));

        return new CheckListDef("Transporte Acuático",6,questionsLegal,questionsTech);
    }//6 READY

    public static CheckListDef getCheckListConCenters(){
        String pregunta1 = "Presenta solicitud de declaratoria turística y declaración jurada de acuerdo al formulario para ese fin?";

        String pregunta2 = "Presenta copia de la patente municipal y del permiso de funcionamiento del Ministerio de Salud (operación)?";
        String pregunta3 = "Se encuentra al día con la CCSS, FODESAF e impuesto a las sociedades?";
        String pregunta4 = "Indica en forma clara en qué consiste la actividad, operación que realiza, descripción de infraestructura y servicios?";
        String pregunta5 = "Obtiene y mantiene una calificación de 80% según las herramientas del evaluación contenidas en el anexo único?";
        String pregunta6 = "Presenta 3 cartas de relaciones comerciales con empresas que tienen la Declaratoria Turística?";
        String pregunta7 = "Presenta cronograma de construcción (proyectos)?";

        ArrayList<CheckListQuestionDef> questionsLegal = new ArrayList<>();
        questionsLegal.add(new CheckListQuestionDef(pregunta1));

        ArrayList<CheckListQuestionDef> questionsTech = new ArrayList<>();
        questionsTech.add(new CheckListQuestionDef(pregunta2));
        questionsTech.add(new CheckListQuestionDef(pregunta3));
        questionsTech.add(new CheckListQuestionDef(pregunta4));
        questionsTech.add(new CheckListQuestionDef(pregunta5));
        questionsTech.add(new CheckListQuestionDef(pregunta6));
        questionsTech.add(new CheckListQuestionDef(pregunta7));

        return new CheckListDef("Congresos y Convenciones",7,questionsLegal,questionsTech);
    }//7 READY

    public static CheckListDef getCheckListGastronomicEnterprise(){
        String pregunta1 = "Presenta solicitud de declaratoria turística y declaración jurada de acuerdo al formulario para ese fin?";
        String pregunta2 = "Presenta copia de la patente municipal y del permiso de funcionamiento del Ministerio de Salud (operación)?";
        String pregunta3 = "Se encuentra al día con la CCSS, FODESAF e impuesto a las sociedades?";
        String pregunta4 = "Indica en forma clara en qué consiste la actividad, operación que realiza y descripción de infraestructura y servicios?";
        String pregunta5 = "Obtiene y mantiene una calificación de 80% según las herramientas del evaluación contenidas en el anexo único?";

        ArrayList<CheckListQuestionDef> questionsLegal = new ArrayList<>();
        questionsLegal.add(new CheckListQuestionDef(pregunta1));

        ArrayList<CheckListQuestionDef> questionsTech = new ArrayList<>();
        questionsTech.add(new CheckListQuestionDef(pregunta2));
        questionsTech.add(new CheckListQuestionDef(pregunta3));
        questionsTech.add(new CheckListQuestionDef(pregunta4));
        questionsTech.add(new CheckListQuestionDef(pregunta5));

        return new CheckListDef("Empresa Gastronomica",8,questionsLegal,questionsTech);
    }//8 READY

    public static CheckListDef getCheckListWaterActivity(){
        String pregunta1 = "Presenta solicitud de declaratoria turística y declaración jurada de acuerdo al formulario para ese fin?";
        String pregunta2 = "Presenta copia de la patente municipal y del permiso de funcionamiento del Ministerio de Salud (operación)?";
        String pregunta3 = "Se encuentra al día con la CCSS, FODESAF e impuesto a las sociedades?";
        String pregunta4 = "Indica en forma clara en qué consiste la actividad, operación que realiza y descripción de infraestructura y servicios?";
        String pregunta5 = "Obtiene y mantiene una calificación de 80% según las herramientas del evaluación contenidas en el anexo único?";
        String pregunta6 = "Presenta cronograma de construcción (proyectos)?";

        ArrayList<CheckListQuestionDef> questionsLegal = new ArrayList<>();
        questionsLegal.add(new CheckListQuestionDef(pregunta1));

        ArrayList<CheckListQuestionDef> questionsTech = new ArrayList<>();
        questionsTech.add(new CheckListQuestionDef(pregunta2));
        questionsTech.add(new CheckListQuestionDef(pregunta3));
        questionsTech.add(new CheckListQuestionDef(pregunta4));
        questionsTech.add(new CheckListQuestionDef(pregunta5));
        questionsTech.add(new CheckListQuestionDef(pregunta6));

        return new CheckListDef("Actividad Recreativa Acuatica",9,questionsLegal,questionsTech);
    }//9 READY

    public static CheckListDef getCheckListAirActivity(){
        String pregunta1 = "Presenta solicitud de declaratoria turística y declaración jurada de acuerdo al formulario para ese fin?";
        String pregunta2 = "Presenta copia de la patente municipal y del permiso de funcionamiento del Ministerio de Salud (operación)?";
        String pregunta3 = "Se encuentra al día con la CCSS, FODESAF e impuesto a las sociedades?";
        String pregunta4 = "Indica en forma clara en qué consiste la actividad, operación que realiza y descripción de infraestructura y servicios?";
        String pregunta5 = "Obtiene y mantiene una calificación de 80% según las herramientas del evaluación contenidas en el anexo único?";
        String pregunta6 = "Presenta cronograma de construcción (proyectos)?";

        ArrayList<CheckListQuestionDef> questionsLegal = new ArrayList<>();
        questionsLegal.add(new CheckListQuestionDef(pregunta1));

        ArrayList<CheckListQuestionDef> questionsTech = new ArrayList<>();
        questionsTech.add(new CheckListQuestionDef(pregunta2));
        questionsTech.add(new CheckListQuestionDef(pregunta3));
        questionsTech.add(new CheckListQuestionDef(pregunta4));
        questionsTech.add(new CheckListQuestionDef(pregunta5));
        questionsTech.add(new CheckListQuestionDef(pregunta6));

        return new CheckListDef("Actividad Recreativa Aerea",10,questionsLegal,questionsTech);
    }//10 READY

    public static CheckListDef getCheckListSpa(){
        String pregunta1 = "Presenta solicitud de declaratoria turística y declaración jurada de acuerdo al formulario para ese fin?";
        String pregunta2 = "Presenta copia de la patente municipal y del permiso de funcionamiento del Ministerio de Salud (operación)?";
        String pregunta3 = "Se encuentra al día con la CCSS, FODESAF e impuesto a las sociedades?";
        String pregunta4 = "Indica en forma clara en qué consiste la actividad, operación que realiza, descripción de infraestructura y servicios?";
        String pregunta5 = "Obtiene y mantiene una calificación de 80% según las herramientas del evaluación contenidas en el anexo único?";
        String pregunta6 = "Presenta documento del ECA? (Spas que utilizan agua potable).";
        String pregunta7 = "Presenta documento del Ministerio de Salud? (Spas que utilizan agua termal o talaso).";
        String pregunta8 = "Los productos presentan registros sanitario?";
        String pregunta9 = "Presenta cronograma de construcción (proyectos)?";

        ArrayList<CheckListQuestionDef> questionsLegal = new ArrayList<>();
        questionsLegal.add(new CheckListQuestionDef(pregunta1));

        ArrayList<CheckListQuestionDef> questionsTech = new ArrayList<>();
        questionsTech.add(new CheckListQuestionDef(pregunta2));
        questionsTech.add(new CheckListQuestionDef(pregunta3));
        questionsTech.add(new CheckListQuestionDef(pregunta4));
        questionsTech.add(new CheckListQuestionDef(pregunta5));
        questionsTech.add(new CheckListQuestionDef(pregunta6));
        questionsTech.add(new CheckListQuestionDef(pregunta7));
        questionsTech.add(new CheckListQuestionDef(pregunta8));
        questionsTech.add(new CheckListQuestionDef(pregunta9));

        return new CheckListDef("Spa",11,questionsLegal,questionsTech);
    }//11 READY
}
