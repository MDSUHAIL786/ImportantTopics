package com.example.patterns.CreationalPatterns.AbstractFactoryPattern.FactoryProvider;

import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory.AbstractCarVehicleFactory;
import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory.Impl.LuxuryFactory;
import com.example.patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory.Impl.OrdinaryFactory;

public class CarFactory {
    public static AbstractCarVehicleFactory getBrandFactory(String brand) throws Exception {
        if(brand.equalsIgnoreCase("Luxury")){
            return new LuxuryFactory();
        }else if(brand.equalsIgnoreCase("Ordinary")){
            return new OrdinaryFactory();
        }else{
            throw new Exception("invalid brand name");
        }
    }
}
