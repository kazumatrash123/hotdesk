package com.hotdesk.app.service;

import java.util.List;

import com.hotdesk.app.entity.Floor;

public interface FloorService {
    public List<Floor> getFloors();

    public Floor getFloorById(int id);
    public List<Floor> getByBuildingId(int id);

    public void addFloor(Floor floor);

    public void updateFloor(Floor floor);

    public void deleteFloor(int id);
}
