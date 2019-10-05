package com.example.gestur.DB.definitionFormClasses;

public class QuestionDefBinary {
    public String number;
    public String question;
    public Boolean NA;
    public Boolean yes;
    public Boolean no;

    public QuestionDefBinary(){

    }
    public QuestionDefBinary(String number,String question){
        this.number = number;
        this.question = question;
        NA = false;
        yes = false;
        no = false;
    }

}
