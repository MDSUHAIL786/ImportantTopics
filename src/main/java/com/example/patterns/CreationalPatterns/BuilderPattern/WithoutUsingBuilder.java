package com.example.patterns.CreationalPatterns.BuilderPattern;

import lombok.Data;

@Data
public class WithoutUsingBuilder {
        //let there are lots of attributes or variable
        private String make;
        private String model;
        private int year;
        private String color;
        private String fuelType;
        private String transmission;
        private int numDoors;
        private int numSeats;
        private boolean hasSunroof;
        private boolean hasGPS;
        private boolean hasBluetooth;
        private boolean hasBackupCamera;
        private boolean hasBlindSpotMonitoring;
        private boolean hasLaneDepartureWarning;

        //constructor
        public WithoutUsingBuilder(String make, String model, int year, String color, String fuelType,
                   String transmission, int numDoors, int numSeats, boolean hasSunroof,
                   boolean hasGPS, boolean hasBluetooth, boolean hasBackupCamera,
                   boolean hasBlindSpotMonitoring, boolean hasLaneDepartureWarning) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.color = color;
            this.fuelType = fuelType;
            this.transmission = transmission;
            this.numDoors = numDoors;
            this.numSeats = numSeats;
            this.hasSunroof = hasSunroof;
            this.hasGPS = hasGPS;
            this.hasBluetooth = hasBluetooth;
            this.hasBackupCamera = hasBackupCamera;
            this.hasBlindSpotMonitoring = hasBlindSpotMonitoring;
            this.hasLaneDepartureWarning = hasLaneDepartureWarning;
        }

        /*
           without using builder pattern you have to make object/instance like below and pass all values to
           constructor in sequence/order as you set the values here, very weired thing, so we use builder
        */

        WithoutUsingBuilder myCar = new WithoutUsingBuilder("Toyota", "Corolla", 2022, "Red", "Gasoline", "Automatic",
            4, 5, true, true, true, false, true, false);

}
