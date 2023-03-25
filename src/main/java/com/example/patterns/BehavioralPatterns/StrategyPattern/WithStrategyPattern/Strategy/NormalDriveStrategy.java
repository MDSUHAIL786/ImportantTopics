package com.example.patterns.BehavioralPatterns.StrategyPattern.WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal capability.");
    }
}
