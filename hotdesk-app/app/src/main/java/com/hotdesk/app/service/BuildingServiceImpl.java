package com.hotdesk.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotdesk.app.dao.BuildingDao;
import com.hotdesk.app.entity.Building;

@Service
public class BuildingServiceImpl implements BuildingService{

    @Autowired
    private BuildingDao buildingDao;

    @Override
    public List<Building> getBuildings() {
        return buildingDao.findAll();
    }

    @Override
    public Building getBuildingById(int id) {
        return buildingDao.findById(id).orElse(null);
    }

    @Override
    public void addBuilding(Building building) {
        buildingDao.save(building);
    }

    @Override
    public void updateBuilding(Building building) {
        buildingDao.save(building);
    }

    @Override
    public void deleteBuilding(int id) {
        buildingDao.deleteById(id);
    }

    @Override
    public List<Building> getByOfficeId(int id) {
        return buildingDao.getByOfficeId(id);
    }
}
