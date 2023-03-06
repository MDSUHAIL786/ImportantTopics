package com.example.patterns.CreationalPatterns.AbstractFactoryPattern.Cars;

import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.Impl.OrdinaryCar;

public class Swift extends OrdinaryCar {

    @Override
    public void setCarVehicleName() {
        this.setCarName("Swift");
    }

    @Override
    public void setBaseCost() {
        this.setBaseCost(25);
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.setChargesPerUnitDistance(15);
    }
}
