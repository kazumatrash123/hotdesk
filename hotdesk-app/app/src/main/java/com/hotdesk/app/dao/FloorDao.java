package com.hotdesk.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hotdesk.app.entity.Floor;

public interface FloorDao extends JpaRepository<Floor, Integer>{
    
    @Query(value = "SELECT * FROM floormaster f where f.buildingid = 'buildingid'", nativeQuery= true)
    List<Floor> getByBuildingId(int buildingid);
}
