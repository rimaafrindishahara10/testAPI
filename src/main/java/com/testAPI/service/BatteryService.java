package com.testAPI.service;

import com.testAPI.entity.Batteries;

import java.util.List;

public interface BatteryService {

    public Batteries addBattery(Batteries batteries);

    public List<Batteries> getAllBatterries();

    public Batteries getOne(Integer id);

}
