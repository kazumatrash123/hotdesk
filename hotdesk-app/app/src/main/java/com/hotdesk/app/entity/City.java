package com.hotdesk.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "citymaster")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cityid")
    private int cityid;
    @Column(name = "isactive", columnDefinition = "BIT", length = 1)
    private boolean isactive;
    @Column(name = "cityname")
    private String cityname;
    private String country;
    private String pincode;
    private String statename;

    @OneToMany(targetEntity = Office.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cityid")
    private List<Office> offices;

    public City(){

    }

    public City(int cityId, boolean isActive, String cityName, String country, String pincode, String statename){
        super();
        this.cityid = cityId;
        this.isactive = isActive;
        this.cityname = cityName;
        this.country = country;
        this.pincode = pincode;
        this.statename = statename;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

    public int getCityId() {
        return cityid;
    }

    public void setCityId(int cityId) {
        this.cityid = cityId;
    }

    public boolean isActive() {
        return isactive;
    }

    public void setActive(boolean active) {
        isactive = active;
    }

    public String getCityName() {
        return cityname;
    }

    public void setCityName(String cityName) {
        this.cityname = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String countryName) {
        this.country = countryName;
    }

    public void setOffices(List<Office> office){
        this.offices = office;
    }

    public List<Office> getOffices(){
        return this.offices;
    }
}
