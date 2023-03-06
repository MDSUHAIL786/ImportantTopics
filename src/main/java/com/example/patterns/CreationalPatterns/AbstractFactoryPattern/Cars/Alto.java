package com.example.patterns.CreationalPatterns.AbstractFactoryPattern.Cars;


import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.Impl.OrdinaryCar;

public class Alto extends OrdinaryCar {
    public Alto(){};
    @Override
    public void setCarVehicleName() {
        this.setCarName("Alto");
    }

    @Override
    public void setBaseCost() {
        this.setBaseCost(20);
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.setChargesPerUnitDistance(10);
    }


}
