package com.testAPI.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BatteryStatistics {
    private int totalWattCapacity;
    private double averageWattCapacity;


}
