package com.example.patterns.BehavioralPatterns.StrategyPattern.WithStrategyPattern;

import com.example.patterns.BehavioralPatterns.StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;
import com.example.patterns.BehavioralPatterns.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
