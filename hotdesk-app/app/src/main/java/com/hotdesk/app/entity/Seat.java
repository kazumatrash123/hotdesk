package com.hotdesk.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seatmaster")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seatid")
    private int seatid;
    @Column(name = "isactive", columnDefinition = "BIT", length = 1)
    private boolean isactive;
    private int cubicleposition;
    private int qrnumber;
    private int seatnumber;
    private String seattype;

    public Seat(){

    }

    public Seat(int seatId, boolean isActive, int cubicleposition, int qrnumber, int seatnumber){
        super();
        this.seatid = seatId;
        this.isactive = isActive;
        this.cubicleposition = cubicleposition;
        this.qrnumber = qrnumber;
        this.seatnumber = seatnumber;
    }

    public int getSeatId() {
        return seatid;
    }

    public void setSeatId(int seatId) {
        this.seatid = seatId;
    }

    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    public int getCubicleposition() {
        return cubicleposition;
    }

    public void setCubicleposition(int cubicleposition) {
        this.cubicleposition = cubicleposition;
    }

    public int getQrnumber() {
        return qrnumber;
    }

    public void setQrnumber(int qrnumber) {
        this.qrnumber = qrnumber;
    }

    public int getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(int seatnumber) {
        this.seatnumber = seatnumber;
    }

    public String getSeattype() {
        return seattype;
    }

    public void setSeattype(String seattype) {
        this.seattype = seattype;
    }
}
