package com.example.patterns.CreationalPatterns.AbstractFactoryPattern.Impl;

import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.CarVehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class OrdinaryCar implements CarVehicle {
    private String carName;
    private int baseCost;
    private int chargesPerUnitDistance;

    @Override
    public void book(int distance){
        setCarVehicleName();
        setBaseCost();
        setVehicleChargesPerUnitDistance();
        int cost = calculateCostOfBooking(distance);
        System.out.println("You have booked a " + carName + " Car for a distance of " + distance + " kms at a total cost of " + cost + ". ");
    }

    @Override
    public int calculateCostOfBooking(int distance){
        int serviceCharge = 10;
        return baseCost + chargesPerUnitDistance * distance + serviceCharge;
    }


}
