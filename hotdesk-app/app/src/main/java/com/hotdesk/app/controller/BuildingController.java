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

import com.hotdesk.app.entity.Building;
import com.hotdesk.app.service.BuildingService;

@RestController
@RequestMapping(path = "/building")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;
    
    @GetMapping(path = "/test")
    public String test(){
        return "Building works";
    }

    @GetMapping(path = "/getAll")
    public List<Building> getAllBuilding(){
        return buildingService.getBuildings();
    }

    @GetMapping(path = "/get/getByOfficeId/{officeid}")
    public List<Building> getByOfficeId(@PathVariable String officeid){
        return buildingService.getByOfficeId(Integer.parseInt(officeid));
    }

    @GetMapping(path = "/getId/{buildingId}")
    public Building getById(@PathVariable String buildingId){
        return buildingService.getBuildingById(Integer.parseInt(buildingId));
    }

    @PostMapping(path = "/buildings", consumes = "application/json")
    public List<Building> addBuilding(@RequestBody Building building){
        this.buildingService.addBuilding(building);
        return this.buildingService.getBuildings();
    }

    @PutMapping(path = "/cities", consumes = "application/json")
    public List<Building> updateCity(@RequestBody Building building){
        this.buildingService.updateBuilding(building);
        return this.buildingService.getBuildings();
    }

    @DeleteMapping(path = "/cities", consumes = "application/json")
    public List<Building> deleteCourse(@PathVariable String cityId){
        this.buildingService.deleteBuilding(Integer.parseInt(cityId));
        return this.buildingService.getBuildings();
    }


}
