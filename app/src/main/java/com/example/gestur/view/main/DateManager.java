package com.example.gestur.view.main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class DateManager {
    private static Integer[] months = {1,2,3,4,5,6,7,8,9,10,11,12};
    private static Integer[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};


    public static ArrayList<Integer> getYears(){
        ArrayList<Integer> years = new ArrayList<Integer>();

        Integer currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (Integer i = currentYear - 80; i <= currentYear; i++) {
            years.add(i);
        }

        return years;
    }

    public static ArrayList<Integer> getMonths(){
        return new ArrayList<Integer>(Arrays.asList(months));
    }

    public static ArrayList<Integer> getDaysFromMonth(Integer month, Integer year){
        ArrayList<Integer> days = new ArrayList<Integer>();

        for (Integer i = 1; i <= ((isLeap(year) && month == 2) ? 29 : monthDays[month -1]); i++) {
            days.add(i);
        }

        return days;
    }

    private static boolean isLeap(int year){
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}
