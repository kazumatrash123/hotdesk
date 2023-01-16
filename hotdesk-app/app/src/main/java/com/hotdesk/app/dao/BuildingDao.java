package com.hotdesk.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hotdesk.app.entity.Building;

public interface BuildingDao extends JpaRepository<Building, Integer>{
    
    @Query(value="SELECT * FROM buildingmaster b where b.officeid = 'officeid'", nativeQuery = true)
    List<Building> getByOfficeId(int officeid);
}
