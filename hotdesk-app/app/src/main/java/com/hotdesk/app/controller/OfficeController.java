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

import com.hotdesk.app.entity.Office;
import com.hotdesk.app.service.OfficeService;

@RestController
@RequestMapping(path = "/office")
public class OfficeController {

    @Autowired
    private OfficeService officeService;
    
    @GetMapping(path = "/test")
    public String test(){
        return "Office works";
    }

    @GetMapping(path = "/getAll")
    public List<Office> getAll(){
        return officeService.getOffices();
    }

    @GetMapping(path = "getByCityId/{cityId}")
    public List<Office> getByCityId(@PathVariable String cityId){
        return officeService.getByCityId(Integer.parseInt(cityId));
    }

    @GetMapping(path = "/getId/{officeId}")
    public Office getById(@PathVariable String OfficeId){
        return officeService.getOfficeById(Integer.parseInt(OfficeId));
    }

    @PostMapping(path = "/cities", consumes = "application/json")
    public List<Office> addOffice(@RequestBody Office Office){
        this.officeService.addOffice(Office);
        return this.officeService.getOffices();
    }

    @PutMapping(path = "/cities", consumes = "application/json")
    public List<Office> updateOffice(@RequestBody Office Office){
        this.officeService.updateOffice(Office);
        return this.officeService.getOffices();
    }

    @DeleteMapping(path = "/cities", consumes = "application/json")
    public List<Office> deleteCourse(@PathVariable String OfficeId){
        this.officeService.deleteOffice(Integer.parseInt(OfficeId));
        return this.officeService.getOffices();
    }
}
