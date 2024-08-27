package com.testAPI.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BatteryResponse  {

    private List<String> batteryNames;
    private BatteryStatistics statistics;
}
