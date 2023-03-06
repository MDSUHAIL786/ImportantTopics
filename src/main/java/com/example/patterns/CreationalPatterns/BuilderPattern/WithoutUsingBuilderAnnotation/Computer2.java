package com.example.patterns.CreationalPatterns.BuilderPattern.WithoutUsingBuilderAnnotation;

public class Computer2 {

    //required
    private String HDD;
    private String RAM;

    //optional
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    private boolean isTouch;

    //constructor which take builder
    public Computer2(Computer2Builder builder) {
        this.HDD=builder.getHDD();
        this.RAM=builder.getRAM();
        this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled();
        this.isBluetoothEnabled=builder.isBluetoothEnabled();
        this.isTouch=builder.isTouch();
    }
    @Override
    public String toString() {
        return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isTouch="+isTouch+"isBluetoothEnabled="+isBluetoothEnabled+"isGraphicsCardEnabled="+isGraphicsCardEnabled+"]";
    }


}
