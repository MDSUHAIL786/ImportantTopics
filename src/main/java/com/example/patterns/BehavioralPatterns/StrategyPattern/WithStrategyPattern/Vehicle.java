package com.example.patterns.BehavioralPatterns.StrategyPattern.WithStrategyPattern;

import com.example.patterns.BehavioralPatterns.StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObj;

    //this is known as constructor injection
    Vehicle(DriveStrategy driveObject){
       this.driveObj=driveObject;
    }

    public void drive(){
        driveObj.drive();
    }
}
