package com.hotdesk.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotdesk.app.dao.CityDao;
import com.hotdesk.app.entity.City;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> getCities() {
        return cityDao.findAll();
    }

    @Override
    public City getCityById(int id) {
        return cityDao.findById(id).orElse(null);
    }

    @Override
    public void addCity(City city) {
        cityDao.save(city);
    }

    @Override
    public void updateCity(City city) {
        cityDao.save(city);
    }

    @Override
    public void deleteCity(int id) {
        cityDao.deleteById(id);
    }
    
}
