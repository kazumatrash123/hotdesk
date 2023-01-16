package com.hotdesk.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotdesk.app.entity.Floor;
import com.hotdesk.app.service.FloorService;

@RestController
@RequestMapping(path = "/floor")
public class FloorController {

    @Autowired
    private FloorService floorService;
    
    @GetMapping(path = "/test")
    public String test(){
        return "Floor works";
    }

    @GetMapping(path = "/getAll")
    public List<Floor> getAll(){
        return floorService.getFloors();
    }

    @GetMapping(path = "/getByBuildingId/{buildingid}")
    public List<Floor> getByBuildingId(@PathVariable String buildingid){
        return floorService.getByBuildingId(Integer.parseInt(buildingid));
    }

    @GetMapping(path = "/getId/{floorId}")
    public Floor getById(@PathVariable String FloorId){
        return floorService.getFloorById(Integer.parseInt(FloorId));
    }

    @PostMapping(path = "/cities", consumes = "application/json")
    public List<Floor> addFloor(@RequestBody Floor Floor){
        this.floorService.addFloor(Floor);
        return this.floorService.getFloors();
    }

    @PutMapping(path = "/cities", consumes = "application/json")
    public List<Floor> updateFloor(@RequestBody Floor Floor){
        this.floorService.updateFloor(Floor);
        return this.floorService.getFloors();
    }

    @DeleteMapping(path = "/cities", consumes = "application/json")
    public List<Floor> deleteCourse(@PathVariable String FloorId){
        this.floorService.deleteFloor(Integer.parseInt(FloorId));
        return this.floorService.getFloors();
    }
}
