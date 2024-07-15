package com.testAPI.service;

import com.testAPI.entity.Batteries;
import com.testAPI.repository.BatteryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatteryServiceImpl implements BatteryService{

    @Autowired
    private BatteryRepo batteryRepo;

    @Override
    public Batteries addBattery(Batteries batteries) {
        return this.batteryRepo.save(batteries);
    }

    @Override
    public List<Batteries> getAllBatterries() {
        return this.batteryRepo.findAll();
    }

    @Override
    public Batteries getOne(Integer id) {
        return this.batteryRepo.findById(id).get();
    }
}
