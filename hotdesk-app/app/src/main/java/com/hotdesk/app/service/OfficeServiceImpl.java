package com.hotdesk.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotdesk.app.dao.OfficeDao;
import com.hotdesk.app.entity.Office;

@Service
public class OfficeServiceImpl implements OfficeService {

    @Autowired
    private OfficeDao officeDao;

    @Override
    public List<Office> getOffices() {
        return officeDao.findAll();
    }

    @Override
    public Office getOfficeById(int id) {
        return officeDao.findById(id).orElse(null);
    }

    @Override
    public void addOffice(Office office) {
        officeDao.save(office);
    }

    @Override
    public void updateOffice(Office office) {
        officeDao.save(office);
    }

    @Override
    public void deleteOffice(int id) {
        officeDao.deleteById(id);
    }

    @Override
    public List<Office> getByCityId(int id) {
        return officeDao.getByCityId(id);
    }
}
