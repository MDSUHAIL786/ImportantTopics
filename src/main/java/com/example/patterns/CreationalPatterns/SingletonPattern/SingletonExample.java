/*

-->The singleton pattern restricts the initialization of a class to ensure that only one instance of the
class can be created.

-->The Singleton design pattern is a creational pattern that ensures that only one instance of a class can
be created and used throughout the entire application.

-->This pattern is useful when you want to have a single point of access to an object in order to maintain
global state or perform some shared functionality.

-----------Some Uses--------------
1. Database Connection manager
2. Configuration Manager
3. Logger

*/

package com.example.patterns.CreationalPatterns.SingletonPattern;

public class SingletonExample {
    private static SingletonExample instance;

    //make constructor private to prevent outside instance creation
    private SingletonExample(){

    }

    //method to call object/instance
    public static SingletonExample getInstance(){
        if(instance==null){
            instance= new SingletonExample();
        }
        return instance;
    }
}
