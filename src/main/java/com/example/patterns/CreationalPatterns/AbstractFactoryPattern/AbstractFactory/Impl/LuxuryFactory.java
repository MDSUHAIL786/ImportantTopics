package com.example.patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory.Impl;

import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory.AbstractCarVehicleFactory;
import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.CarVehicle;
import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.Cars.Alto;
import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.Cars.Swift;

public class LuxuryFactory extends AbstractCarVehicleFactory {
    @Override
    public CarVehicle getCarVehicle(String carName) throws Exception {
        if (carName.equalsIgnoreCase("BMW")) {
            return new Alto();
        } else if (carName.equalsIgnoreCase("Audi")) {
            return new Swift();
        } else {
            throw new Exception("invalid car name");
        }
    }
}
