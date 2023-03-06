package com.example.patterns.CreationalPatterns.AbstractFactoryPattern.Cars;

import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.Impl.LuxuryCar;

public class BMW extends LuxuryCar {
    @Override
    public void setCarVehicleName() {
        this.setCarName("BMW");
    }

    @Override
    public void setBaseCost() {
        this.setBaseCost(50);
    }



    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.setChargesPerUnitDistance(30);
    }
}
