package com.example.patterns.BehavioralPatterns.StrategyPattern.WithoutStrategyPattern;

public class Vehicle {

    public void drive(){
        System.out.println("normal drive capability.");
    }

    //Note : OffRoadVehicle and SportsVehicle need same capability other than normal so having same implementation of drive method. means duplicacy of code.
}
