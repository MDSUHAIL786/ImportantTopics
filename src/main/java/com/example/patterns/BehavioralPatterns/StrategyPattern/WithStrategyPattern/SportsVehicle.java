package com.example.patterns.BehavioralPatterns.StrategyPattern.WithStrategyPattern;

import com.example.patterns.BehavioralPatterns.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
