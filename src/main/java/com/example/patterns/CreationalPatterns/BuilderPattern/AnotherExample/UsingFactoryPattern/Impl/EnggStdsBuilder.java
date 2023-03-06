package com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.UsingFactoryPattern.Impl;

import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.Student;
import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.StudentBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnggStdsBuilder extends StudentBuilder {
    private StudentBuilder studentBuilder;


    @Override
    public StudentBuilder setSubjects() {
        List<String> subs=new ArrayList<>();
        subs.add("DSA");subs.add("CS");subs.add("OS");
        this.setSubjects(subs);
        return this;
    }
    private Student createMbaStd() {
        return studentBuilder.setRollNo(23).setAge(21).setSubjects().setName("suhail").build();
    }

}
