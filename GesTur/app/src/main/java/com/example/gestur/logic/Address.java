package com.example.gestur.logic;

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