package com.example.patterns.CreationalPatterns.BuilderPattern.UsingBuilderAnnotation;

import lombok.*;

/*
  @Builder has its own getter and setter no need to use @Getter and @Setter
*/

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Computer{

    /*
     which is required field apply @NotNull annotation on that and then if that field not set
     in object using builder give NullPointException.
     */
    private String HDD;
    private String RAM;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    private boolean isTouch;


    /*
    Note: you need override this when you need to print the object in console or log it for debugging
    purpose otherwise if you want to print your object without override toString method then it print
    object address like Computer@123abc
    and without override this method syso(Computer) and syso(Computer.toString()) print same like Computer@123abc
    */
    @Override
    public String toString() {
        return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isTouch"+isTouch+"]";
    }


}