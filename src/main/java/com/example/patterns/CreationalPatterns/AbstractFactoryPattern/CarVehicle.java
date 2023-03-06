package com.example.patterns.CreationalPatterns.AbstractFactoryPattern;

public interface CarVehicle {
    void book(int distance);
    void setCarVehicleName();
    void setBaseCost();
    void setVehicleChargesPerUnitDistance();
    int calculateCostOfBooking(int distance);
}
