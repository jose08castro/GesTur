package com.example.gestur.view.main;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;

public class DateManager {
    private static Integer[] months = {1,2,3,4,5,6,7,8,9,10,11,12};


    public static ArrayList<Integer> getYears(){
        ArrayList<Integer> years = new ArrayList<Integer>();
        LocalDateTime now = LocalDateTime.now();

        Integer currentYear = now.getYear();
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

        YearMonth yearMonthObject = YearMonth.of(year, month);
        Integer daysInMonth = yearMonthObject.lengthOfMonth();

        for (Integer i = 1; i <= daysInMonth; i++) {
            days.add(i);
        }

        return days;
    }
}
