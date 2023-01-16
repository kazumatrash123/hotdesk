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
@Table(name = "officemaster")
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "officeid")
    private int officeid;
    @Column(name = "isactive", columnDefinition = "BIT", length = 1)
    private boolean isactive;
    private String officename;

    @OneToMany(targetEntity = Building.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "officeid")
    private List<Building> building;

    
    public Office(){
    }
    
    public Office(int officeId, boolean isActive, String officename){
        super();
        this.officeid = officeId;
        this.isactive = isActive;
        this.officename = officename;
    }
    
    public int getOfficeId() {
        return officeid;
    }
    
    public void setOfficeId(int officeId) {
        this.officeid = officeId;
    }
    
    public boolean isIsactive() {
        return isactive;
    }
    
    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }
    
    public String getOfficename() {
        return officename;
    }
    
    public void setOfficename(String officename) {
        this.officename = officename;
    }
    
    public List<Building> getBuilding() {
        return building;
    }
    
    public void setBuilding(List<Building> building) {
        this.building = building;
    }
}
