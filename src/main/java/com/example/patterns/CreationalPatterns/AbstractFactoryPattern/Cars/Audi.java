package com.example.patterns.CreationalPatterns.AbstractFactoryPattern.Cars;

import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.Impl.LuxuryCar;

public class Audi extends LuxuryCar {

    @Override
    public void setCarVehicleName() {
        this.setCarName("Audi");
    }

    @Override
    public void setBaseCost() {
        this.setBaseCost(40);
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.setChargesPerUnitDistance(30);
    }
}
