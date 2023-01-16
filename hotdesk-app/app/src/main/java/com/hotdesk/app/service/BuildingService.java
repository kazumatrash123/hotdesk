package com.hotdesk.app.service;

import java.util.List;

import com.hotdesk.app.entity.Building;

public interface BuildingService {
    public List<Building> getBuildings();

    public Building getBuildingById(int id);
    public List<Building> getByOfficeId(int id);

    public void addBuilding(Building building);

    public void updateBuilding(Building building);

    public void deleteBuilding(int id);
}
