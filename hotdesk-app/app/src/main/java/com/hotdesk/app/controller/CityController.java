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

import com.hotdesk.app.entity.City;
import com.hotdesk.app.service.CityService;

@RestController
@RequestMapping(path = "/city")
public class CityController {

    @Autowired
    private CityService cityService;
    
    @GetMapping(path = "/test")
    public String test(){
        return "City works";
    }

    @GetMapping(path = "/getAll")
    public List<City> getAll(){
        return cityService.getCities();
    }

    @GetMapping(path = "/getId/{cityId}")
    public City getById(@PathVariable String cityId){
        return cityService.getCityById(Integer.parseInt(cityId));
    }

    @PostMapping(path = "/cities", consumes = "application/json")
    public List<City> addCity(@RequestBody City city){
        this.cityService.addCity(city);
        return this.cityService.getCities();
    }

    @PutMapping(path = "/cities", consumes = "application/json")
    public List<City> updateCity(@RequestBody City city){
        this.cityService.updateCity(city);
        return this.cityService.getCities();
    }

    @DeleteMapping(path = "/cities", consumes = "application/json")
    public List<City> deleteCourse(@PathVariable String cityId){
        this.cityService.deleteCity(Integer.parseInt(cityId));
        return this.cityService.getCities();
    }
}
