package com.example.gestur.logic;

import java.util.ArrayList;

public class User {

    private String id;
    private String fullName;
    private String userName;
    private String emailAddress;
    private String password;
    private ArrayList<String> phoneNumbers;

    public User(String id, String fullName, String userName, String emailAddress, String password, ArrayList<String> phoneNumbers) {
        this.id = id;
        this.fullName = fullName;
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.phoneNumbers = phoneNumbers;
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
