package com.webapp.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tester")
public class myEntity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "testingid")
    private Integer testingid;

    @Column(name = "testname")
    private String testname;

    @Column(name = "startingage")
    private Integer startingage;

    @Column(name = "endingage")
    private Integer endingage;

    @Column(name = "gender")
    private String gender;

    @Column(name = "minresult")
    private Float minresult;

    @Column(name = "maxresult")
    private Float maxresult;

    @Column(name = "unit")
    private String unit;

    public myEntity() {
    }

    public myEntity(Integer id, Integer testingid, String testname, Integer startingage, Integer endingage,
            String gender,
            Float minresult, Float maxresult, String unit) {
        this.id = id;
        this.testingid = testingid;
        this.testname = testname;
        this.startingage = startingage;
        this.endingage = endingage;
        this.gender = gender;
        this.minresult = minresult;
        this.maxresult = maxresult;
        this.unit = unit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTestingid() {
        return testingid;
    }

    public void setTestingid(Integer testingid) {
        this.testingid = testingid;
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }

    public Integer getStartingage() {
        return startingage;
    }

    public void setStartingage(Integer startingage) {
        this.startingage = startingage;
    }

    public Integer getEndingage() {
        return endingage;
    }

    public void setEndingage(Integer endingage) {
        this.endingage = endingage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Float getMinresults() {
        return minresult;
    }

    public void setMinresults(Float minresults) {
        this.minresult = minresults;
    }

    public Float getMaxresults() {
        return maxresult;
    }

    public void setMaxresults(Float maxresults) {
        this.maxresult = maxresults;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
