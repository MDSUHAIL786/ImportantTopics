package com.example.patterns.BehavioralPatterns.StrategyPattern.WithStrategyPattern;

import com.example.patterns.BehavioralPatterns.StrategyPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerStrategy extends Vehicle{

    PassengerStrategy(){
        super(new NormalDriveStrategy());
    }
}
