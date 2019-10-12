package com.example.gestur.logic;

import com.example.gestur.DB.UserDummy;

import java.util.ArrayList;

public class User {

    private String id;
    private String fullName;
    private String userName;
    private String emailAddress;
    private String password;
    private String bornDate;
    private ArrayList<String> phoneNumbers;

    private ArrayList<Activity> activities;

    public User(String id, String fullName, String userName, String emailAddress, String password,String date, ArrayList<String> phoneNumbers) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.phoneNumbers = phoneNumbers;
        if(phoneNumbers == null){
            this.phoneNumbers = new ArrayList<>();
        }
        this.bornDate = date;
        activities = new ArrayList<>();
    }

    public User(String id, String fullName, String userName, String emailAddress, String password, String date, ArrayList<String> phoneNumbers, ArrayList<Activity> activities) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.phoneNumbers = phoneNumbers;
        if(phoneNumbers == null){
            this.phoneNumbers = new ArrayList<>();
        }
        this.bornDate = date;
        this.activities = activities;
        if(activities == null){
            this.activities = new ArrayList<>();
        }
    }
    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public String getBornDate() {
        return bornDate;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void addPhoneNumber(String phoneNumber){
        if(phoneNumbers==null){
            phoneNumbers = new ArrayList<String>();
        }
        phoneNumbers.add(phoneNumber);
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
