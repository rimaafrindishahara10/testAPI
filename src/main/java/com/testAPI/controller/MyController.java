package com.testAPI.controller;

import com.testAPI.entity.Batteries;
import com.testAPI.service.BatteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private BatteryService batteryService;

    //Post-Method
    @PostMapping("/batteries")
    public Batteries addBattery(@RequestBody Batteries batteries){
        return this.batteryService.addBattery(batteries);

    }

    //Get-All-Method
    @GetMapping("/batteries")
    public List<Batteries> getAllBatteries(){
        return this.batteryService.getAllBatterries();
    }

    //Get-ONE-Method
    @GetMapping("/batteries/{id}")
    public Batteries getOne(@PathVariable Integer id){
        return this.batteryService.getOne(id);
    }


}
