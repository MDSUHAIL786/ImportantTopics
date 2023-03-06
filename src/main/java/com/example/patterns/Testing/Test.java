package com.example.patterns.Testing;

import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.Director.StudentDirector;
import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.Student;
import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.TypeOfStudentBuilder.EngineeringStudentBuilder;
import com.example.patterns.CreationalPatterns.BuilderPattern.BuilderUsingNestedClass.Computer3;
import com.example.patterns.CreationalPatterns.BuilderPattern.UsingBuilderAnnotation.Computer;
import com.example.patterns.CreationalPatterns.BuilderPattern.WithoutUsingBuilderAnnotation.Computer2;
import com.example.patterns.CreationalPatterns.BuilderPattern.WithoutUsingBuilderAnnotation.Computer2Builder;
import com.example.patterns.CreationalPatterns.FactoryDesignPattern.factory.MathematicalOperationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class Test {

    @Autowired
    private MathematicalOperationFactory factory;
    public void testing() throws Exception {

        //Builder testing

        /*
        using Builder to get the object in a single line of code and without any inconsistent state or arguments management issues i.e we can set
        arguments in any order no need to remember sequence/order.
         */

        //testing of Builder pattern which use @Builder annotation
        Computer computer=new Computer().builder().HDD("suhais").isGraphicsCardEnabled(false).build();
        /* or
        Computer computer=null;
        computer=computer.builder().HDD("suhais").isGraphicsCardEnabled(false).build();
        */

        //testing of Builder pattern in which i created Builder class manually
        Computer2 computer2=null;
        computer2=new Computer2Builder().setBluetoothEnabled(false).setRAM("3GB").setHDD("df").build();

        /*
        testing of Builder pattern in which i nested created Builder class
        required params here need to follow order/sequence
         */
        Computer3 computer3=null;
        computer3=new Computer3.ComputerBuilder("3GbHdd","4GbRam").setBluetoothEnabled(false).setGraphicsCardEnabled(true).build();

        StudentDirector director=new StudentDirector(new EngineeringStudentBuilder());
        Student std=director.createStudent();

//        Student std=

        //Factory Testing

//        Scanner obj=new Scanner(System.in);
//        String operation=obj.next();
//        int a=obj.nextInt();int b=obj.nextInt();


        //print
//        System.out.println(factory.getOperation(operation).applyOperation(a,b));
        System.out.println(computer);
        System.out.println(computer2);
        System.out.println(computer3);
        System.out.println(std);
    }
}
