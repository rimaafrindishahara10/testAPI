package com.testAPI.service;

import com.testAPI.entity.Batteries;
import com.testAPI.repository.BatteryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BatteryServiceImpl implements BatteryService{

    @Autowired
    private BatteryRepo batteryRepo;

    @Override
    public void addBattery(Batteries batteries) {
        this.batteryRepo.save(batteries);
    }

    @Override
    public List<Batteries> getAllBatteries() {
        return this.batteryRepo.findAll();
    }

    @Override
    public BatteryResponse getBatteryResponses(String postCode) {
        // Check for valid postCode input
        if (postCode == null || !postCode.matches("\\d+-\\d+")) {
            throw new IllegalArgumentException("Invalid postCode format. Expected format is 'start-end'.");
        }

        // Parse the range string "100-120" into two parts: "100" and "120"
        String[] parts = postCode.split("-");
        String start = String.valueOf(Integer.parseInt(parts[0]));
        String end = String.valueOf(Integer.parseInt(parts[1]));


        // Retrieve batteries within the specified postcode range
        List<Batteries> postRange = batteryRepo.findByPostCodeBetween(start,end);

        // Extract battery names
        List<String> batteryNames = postRange.stream()
                .map(Batteries::getName).sorted()
                .collect(Collectors.toList());

        // Calculate total and average watt capacity
        int totalWattCapacity = postRange.stream()
                .mapToInt(Batteries::getWattCapacity)
                .sum();

        double averageWattCapacity = postRange.isEmpty() ? 0 : (double) totalWattCapacity / postRange.size();

        // Create BatteryStatistics and BatteryResponse objects
        BatteryStatistics statistics = new BatteryStatistics(totalWattCapacity, averageWattCapacity);
        return new BatteryResponse(batteryNames, statistics);
    }


}
