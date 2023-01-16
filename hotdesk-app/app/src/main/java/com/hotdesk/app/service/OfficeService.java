package com.hotdesk.app.service;

import java.util.List;

import com.hotdesk.app.entity.Office;

public interface OfficeService {
    public List<Office> getOffices();

    public Office getOfficeById(int id);
    public List<Office> getByCityId(int id);

    public void addOffice(Office office);

    public void updateOffice(Office office);

    public void deleteOffice(int id);
}
