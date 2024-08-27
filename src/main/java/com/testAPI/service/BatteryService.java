package com.testAPI.service;

import com.testAPI.entity.Batteries;

import java.util.List;

public interface BatteryService {

    public void  addBattery(Batteries batteries);

    public List<Batteries> getAllBatteries();

    public BatteryResponse getBatteryResponses(String postCode);



}
