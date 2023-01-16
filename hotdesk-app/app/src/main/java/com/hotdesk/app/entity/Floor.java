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
@Table(name = "floormaster")
public class Floor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "floorid")
    private int floorid;
    @Column(name = "isactive", columnDefinition = "BIT", length = 1)
    private boolean isactive;
    private String floorname;
    private String floorplan;

    @OneToMany(targetEntity = Seat.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "floorid")
    private List<Seat> seat;

    public Floor(){
        
    }
    
    public Floor(int floorId, boolean isActive, String floorname, String floorplan){
        super();
        this.floorid = floorId;
        this.isactive = isActive;
        this.floorname = floorname;
        this.floorplan = floorplan;
    }

    public int getFloorId() {
        return floorid;
    }
    
    public void setFloorId(int floorId) {
        this.floorid = floorId;
    }
    
    public boolean isIsactive() {
        return isactive;
    }
    
    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }
    
    public String getFloorname() {
        return floorname;
    }
    
    public void setFloorname(String floorname) {
        this.floorname = floorname;
    }
    
    public String getFloorplan() {
        return floorplan;
    }
    
    public void setFloorplan(String floorplan) {
        this.floorplan = floorplan;
    }
    
    public List<Seat> getSeat() {
        return seat;
    }
    
    public void setSeat(List<Seat> seat) {
        this.seat = seat;
    }
}
