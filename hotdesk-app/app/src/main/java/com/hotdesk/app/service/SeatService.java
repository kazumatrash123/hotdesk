package com.hotdesk.app.service;

import java.util.List;

import com.hotdesk.app.entity.Seat;

public interface SeatService {
    public List<Seat> getSeats();

    public Seat getSeatById(int id);

    public List<Seat> getByFloorId(int id);

    public void addSeat(Seat seat);

    public void updateSeat(Seat seat);

    public void deleteSeat(int id);

    public Seat getSeatTypeById(int seatId);
}
