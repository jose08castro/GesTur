package com.example.gestur.logic;

import com.example.gestur.logic.checkList.CheckListForm;
import com.example.gestur.logic.forms.Form;

public class Activity {

    private String name;
    private Address location;
    private Boolean isOperative;
    private String category;
    private int type;
    private Form mainForm;
    private CheckListForm checkForm;

    public Activity(String name, Address location, Boolean isOperative, String category,int type) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.isOperative = isOperative;
        this.category = category;
        this.mainForm = FormFactory.getForm(type);
        this.checkForm = FormFactory.getCheckList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public Boolean isOperative() {
        return isOperative;
    }

    public void setOperative(Boolean operative) {
        isOperative = operative;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public class Address{
        private String province;
        private String canton;
        private String district;
        private String location;

        public Address(String province, String canton, String district, String location) {
            this.province = province;
            this.canton = canton;
            this.district = district;
            this.location = location;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCanton() {
            return canton;
        }

        public void setCanton(String canton) {
            this.canton = canton;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
    }
}
