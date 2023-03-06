package com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.Director;

import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.Student;
import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.StudentBuilder;
import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.TypeOfStudentBuilder.EngineeringStudentBuilder;
import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.TypeOfStudentBuilder.MBAStudentBuilder;

public class StudentDirector {
    private StudentBuilder studentBuilder;

    public StudentDirector(StudentBuilder builder){
        this.studentBuilder=builder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEnggStd();
        }else if(studentBuilder instanceof MBAStudentBuilder){
            return createMbaStd();
        }
        return null;
    }

    private Student createMbaStd() {
        return studentBuilder.setRollNo(23).setAge(21).setSubjects().setName("suhail").build();
    }

    private Student createEnggStd() {
        return studentBuilder.setRollNo(3).setAge(23).setSubjects().setName("sahil").build();
    }
}
