package com.hotdesk.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotdesk.app.dao.FloorDao;
import com.hotdesk.app.entity.Floor;

@Service
public class FloorServiceImpl implements FloorService {

    @Autowired
    private FloorDao floorDao;

    @Override
    public List<Floor> getFloors() {
        return floorDao.findAll();
    }

    @Override
    public Floor getFloorById(int id) {
        return floorDao.findById(id).orElse(null);
    }

    @Override
    public void addFloor(Floor floor) {
        floorDao.save(floor);
    }

    @Override
    public void updateFloor(Floor floor) {
        floorDao.save(floor);
    }

    @Override
    public void deleteFloor(int id) {
        floorDao.deleteById(id);
    }

    @Override
    public List<Floor> getByBuildingId(int id) {
        return floorDao.getByBuildingId(id);
    }
    
}
