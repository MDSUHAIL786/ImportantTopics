package com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.TypeOfStudentBuilder;

import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.StudentBuilder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> subs=new ArrayList<>();
        subs.add("Eco");subs.add("Business Studies");subs.add("Operation Management");
        this.setSubjects(subs);
        return this;
    }
}
