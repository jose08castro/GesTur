package com.example.gestur.DB.definitionFormClasses;

import com.example.gestur.logic.chapters.BinaryChapter;
import com.example.gestur.logic.questions.BinaryQuestion;

import java.util.ArrayList;

public class ChapterDefBinary {
    public String name;
    public String number;
    public float totalPercentage;
    public float achievedChapterPercentage;
    public float achievedFormPercentage;
    public ArrayList<QuestionDefBinary> questions;

    public ChapterDefBinary(){

    }
    public ChapterDefBinary(String name,String number, float totalPercentage,ArrayList<QuestionDefBinary> questions){
        this.name = name;
        this.number = number;
        this.totalPercentage = totalPercentage;
        this.questions = questions;
        achievedChapterPercentage = 0f;
        achievedFormPercentage = 0f;
    }
}
