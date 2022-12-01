package com.crud.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Machine {
    public Machine(){};



    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String serialNumber;
    private String clamp;
    private String customer;
    private Boolean available;
    private String notes;

    public Machine(String serialNumber, String clamp, String customer, Boolean available, String notes) {
        this.serialNumber = serialNumber;
        this.clamp = clamp;
        this.customer = customer;
        this.available = available;
        this.notes = notes;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getClamp() {
        return clamp;
    }

    public void setClamp(String clamp) {
        this.clamp = clamp;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
