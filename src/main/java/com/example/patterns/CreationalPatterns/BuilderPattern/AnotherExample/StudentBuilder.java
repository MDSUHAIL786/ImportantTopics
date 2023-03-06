package com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
public abstract class StudentBuilder {
    private Integer rollNo;
    private Integer age;
    private String name;
    private String fatherName;
    private List<String> subjects;

    public StudentBuilder setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setSubjects(List<String> subjects) {
        this.subjects = subjects;
        return this;
    }

    abstract public StudentBuilder setSubjects();
    public Student build(){
        return new Student(this);
    }
}

