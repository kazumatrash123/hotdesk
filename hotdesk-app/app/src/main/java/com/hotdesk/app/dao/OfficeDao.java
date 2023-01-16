package com.hotdesk.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hotdesk.app.entity.Office;

public interface OfficeDao extends JpaRepository<Office, Integer>{

    @Query(value = "SELECT * FROM officemaster o where o.cityid = 'cityid'", nativeQuery = true)
    List<Office> getByCityId(int cityid);
}
