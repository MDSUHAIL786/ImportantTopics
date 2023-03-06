package com.example.patterns.CreationalPatterns.BuilderPattern.WithoutUsingBuilderAnnotation;

import lombok.Getter;


/*
  Computer2Builder have same fields as computer2 have
 */
@Getter
public class Computer2Builder {
    //required
    private String HDD;
    private String RAM;

    //optional
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    private boolean isTouch;

    /*
    setters for every field which return Computer2Builder itself, This allows us to chain the calls to these methods together
    when building a Computer object
    */
    public Computer2Builder setHDD(String HDD) {
        this.HDD = HDD;
        return this;
    }

    public Computer2Builder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public Computer2Builder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        isGraphicsCardEnabled = graphicsCardEnabled;
        return this;
    }

    public Computer2Builder setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
        return this;
    }

    public Computer2Builder setTouch(boolean touch) {
        isTouch = touch;
        return this;
    }


    //build method that creates a new Computer2 object using the values set in the Computer2Builder
    public Computer2 build() throws Exception {
        if(HDD ==null || RAM==null){
            throw new Exception("set required params.");
        }
        return new Computer2(this);
    }
}
