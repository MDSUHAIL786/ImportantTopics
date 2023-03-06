package com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.UsingFactoryPattern.Impl;

import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.Student;
import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.StudentBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MbaStdsBuilder extends StudentBuilder {
    private StudentBuilder studentBuilder;
    @Override
    public StudentBuilder setSubjects() {
        List<String> subs=new ArrayList<>();
        subs.add("Eco");subs.add("Business Studies");subs.add("Operation Management");
        this.setSubjects(subs);
        return this;
    }

    private Student createEnggStd() {
        return studentBuilder.setRollNo(3).setAge(23).setSubjects().setName("sahil").build();
    }
}
