package com.example.gestur.DB;

import com.example.gestur.logic.Activity;
import com.example.gestur.logic.User;

import java.util.ArrayList;

public class UserDummy {
    public String id;
    public String fullName;
    public String userName;
    public String emailAddress;
    public String password;
    public String bornDate;
    public ArrayList<String> phoneNumbers;

    public ArrayList<ActivityDummy> activities;

    public UserDummy(){

    }
    public UserDummy(String id, String fullName, String userName, String emailAddress, String password,String date,
                     ArrayList<String> phoneNumbers,ArrayList<ActivityDummy> activities){
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.bornDate = date;
        this.phoneNumbers = phoneNumbers;
        this.activities = activities;
    }
}
