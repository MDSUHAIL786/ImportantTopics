package com.example.patterns.BehavioralPatterns.StrategyPattern.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new SportsVehicle();   // make obj of SportsVehicle which call the parentclass object with SportsDriveStrategy obj.
        vehicle.drive();  // this return implementation of SportsDriveStrategy
    }
}
