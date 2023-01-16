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
@Table(name = "seattype")
public class SeatType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seattypeid")
    private int seattypeid;
    private String seatcode;
    private String seatname;

    @OneToMany(targetEntity = Seat.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "seattypeid")
    private List<Seat> seat;

    public List<Seat> getSeat() {
        return seat;
    }

    public void setSeat(List<Seat> seat) {
        this.seat = seat;
    }

    public SeatType(){
        
    }

    public SeatType(int seattypeId, String seatcode, String seatname){
        this.seattypeid = seattypeId;
        this.seatcode = seatcode;
        this.seatname = seatname;
    }

    public int getSeattypeId() {
        return seattypeid;
    }

    public void setSeattypeId(int seattypeId) {
        this.seattypeid = seattypeId;
    }

    public String getSeatcode() {
        return seatcode;
    }

    public void setSeatcode(String seatcode) {
        this.seatcode = seatcode;
    }

    public String getSeatname() {
        return seatname;
    }

    public void setSeatname(String seatname) {
        this.seatname = seatname;
    }
}
