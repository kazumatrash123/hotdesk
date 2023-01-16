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
@Table(name = "buildingmaster")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buildingid")
    private int buildingid;
    @Column(name = "isactive", columnDefinition = "BIT", length = 1)
    private boolean isactive;
    private String buildingname;

    @OneToMany(targetEntity = Floor.class, cascade = CascadeType.ALL)
    @JoinColumn(name= "buildingid")
    private List<Floor> floors;


    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public Building(){

    }

    public Building(int buildingId, boolean isActive, String buildingname){
        super();
        this.buildingid = buildingId;
        this.isactive = isActive;
        this.buildingname = buildingname;
    }

    public int getBuildingId() {
        return buildingid;
    }

    public void setBuildingId(int buildingId) {
        this.buildingid = buildingId;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }
}
