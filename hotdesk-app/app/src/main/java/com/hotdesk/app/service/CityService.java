package com.hotdesk.app.service;

import java.util.List;

import com.hotdesk.app.entity.City;

public interface CityService {
    
    public List<City> getCities();

    public City getCityById(int id);

    public void addCity(City city);

    public void updateCity(City city);

    public void deleteCity(int id);
}
