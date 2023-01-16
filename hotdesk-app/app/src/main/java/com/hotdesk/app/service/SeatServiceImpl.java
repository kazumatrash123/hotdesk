package com.hotdesk.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotdesk.app.dao.SeatDao;
import com.hotdesk.app.entity.Seat;

@Service
public class SeatServiceImpl implements SeatService{

    @Autowired
    private SeatDao seatDao;

    @Override
    public List<Seat> getSeats() {
        return seatDao.findAll();
    }

    @Override
    public Seat getSeatById(int id) {
        return seatDao.findById(id).orElse(null);
    }

    @Override
    public void addSeat(Seat seat) {
        seatDao.save(seat);
    }

    @Override
    public void updateSeat(Seat seat) {
        seatDao.save(seat);
    }

    @Override
    public void deleteSeat(int id) {
        seatDao.deleteById(id);
    }

    @Override
    public Seat getSeatTypeById(int seatId) {
        return null;
    }

    @Override
    public List<Seat> getByFloorId(int id) {
        return seatDao.getByFloorId(id);
    }
    
}
