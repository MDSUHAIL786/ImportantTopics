package com.example.patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory;


import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.CarVehicle;

public abstract class AbstractCarVehicleFactory{
    public abstract CarVehicle getCarVehicle(String carName) throws Exception;
}
