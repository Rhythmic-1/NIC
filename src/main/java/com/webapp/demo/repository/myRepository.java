package com.webapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.webapp.demo.entity.myEntity;

public interface myRepository extends JpaRepository<myEntity, Integer> {
    List<myEntity> findByTestingidAndGenderAndUnit(Integer testingid, String gender, String unit);
}
