package com.testAPI.controller;

import com.testAPI.entity.Batteries;
import com.testAPI.service.BatteryResponse;
import com.testAPI.service.BatteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/batteries")
public class MyController {

    @Autowired
    private BatteryService batteryService;

    //Post-Method
    @PostMapping(" ")
    public void addBattery(@RequestBody Batteries batteries){


         this.batteryService.addBattery(batteries);

    }

    //Get-All-Method
    @GetMapping(" ")
    public List<Batteries> getAllBatteries(){
        return this.batteryService.getAllBatteries();
    }

    //Get-All-Method
    @GetMapping("/{postCode}")
    public BatteryResponse getBatteryResponses(@PathVariable String postCode){

                return this.batteryService.getBatteryResponses(postCode);

    }





}
