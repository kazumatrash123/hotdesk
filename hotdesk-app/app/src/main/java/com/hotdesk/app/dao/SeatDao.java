package com.hotdesk.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hotdesk.app.entity.Seat;

public interface SeatDao extends JpaRepository<Seat, Integer>{
    
    @Query(value = "SELECT * FROM seatmaster s where s.floorid = 'floorid'", nativeQuery = true)
    public List<Seat> getByFloorId(int floorid);
}
