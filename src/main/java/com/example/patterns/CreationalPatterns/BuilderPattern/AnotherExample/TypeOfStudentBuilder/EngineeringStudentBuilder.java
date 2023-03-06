package com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.TypeOfStudentBuilder;

import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.StudentBuilder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> subs=new ArrayList<>();
        subs.add("DSA");subs.add("CS");subs.add("OS");
        this.setSubjects(subs);
        return this;
    }
}
