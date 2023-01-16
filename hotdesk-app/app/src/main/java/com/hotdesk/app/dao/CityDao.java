package com.hotdesk.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotdesk.app.entity.City;

public interface CityDao extends JpaRepository<City, Integer>{
    
}
