package com.hotdesk.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotdesk.app.entity.Seat;
import com.hotdesk.app.service.SeatService;

@RestController
@RequestMapping(path = "/seat")
public class SeatController {
    
    @Autowired
    private SeatService seatService;

    @GetMapping(path = "/test")
    public String test(){
        return "Seat works";
    }

    @GetMapping(path = "/getAll", produces = "application/json")
    // public List<Seat> getAll(){
    //     return seatService.getSeats();
    // }
    public ResponseEntity<Object> getAll(){
        Map<String, List<Seat>> data = new HashMap<>();
        data.put("Response", seatService.getSeats());
        return new ResponseEntity<>(data, HttpStatus.OK);
    }


    @GetMapping(path = "/getId/{seatId}", produces = "application/json")
    public ResponseEntity<Object> getById(@PathVariable String seatId){
        Map<String, Seat> data = new HashMap<>();
        data.put("Message", seatService.getSeatById(Integer.parseInt(seatId)));
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @GetMapping(path = "/getByFloorId/{floorid}")
    public List<Seat> getByFloorId(@PathVariable String floorid){
        return seatService.getByFloorId(Integer.parseInt(floorid));
    }

    @PostMapping(path = "/seats", consumes = "application/json")
    public List<Seat> addCity(@RequestBody Seat seat){
        this.seatService.addSeat(seat);
        return this.seatService.getSeats();
    }

    @PutMapping(path = "/seats", consumes = "application/json")
    public List<Seat> updateCity(@RequestBody Seat seat){
        this.seatService.updateSeat(seat);
        return this.seatService.getSeats();
    }

    @DeleteMapping(path = "/seats", consumes = "application/json")
    public List<Seat> deleteCourse(@PathVariable String seatId){
        this.seatService.deleteSeat(Integer.parseInt(seatId));
        return this.seatService.getSeats();
    }
}
