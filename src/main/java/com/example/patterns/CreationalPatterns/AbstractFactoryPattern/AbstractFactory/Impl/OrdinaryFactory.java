package com.example.patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory.Impl;

import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory.AbstractCarVehicleFactory;
import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.CarVehicle;
import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.Cars.Alto;
import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.Cars.Swift;

public class OrdinaryFactory extends AbstractCarVehicleFactory {
    @Override
    public CarVehicle getCarVehicle(String carName) throws Exception {
        if(carName.equalsIgnoreCase("Alto")) {
            return new Alto();
        }
        else if(carName.equalsIgnoreCase("Swift")) {
            return new Swift();
        }else{
            throw new Exception("invalid car name");
        }
    }
}
