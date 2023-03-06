package com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer rollNo;
    private Integer age;
    private String name;
    private String fatherName;
    private List<String> subjects;

    public Student(StudentBuilder builder){
        this.subjects=builder.getSubjects();
        this.name=builder.getName();
        this.fatherName= builder.getFatherName();
        this.rollNo= builder.getRollNo();
        this.age=builder.getAge();
    }

    @Override
    public String toString(){
        return "Student : [rollNo="+rollNo+"age="+age+"name="+name+"fatherName="+fatherName+"subjects="+
                subjects.toString();
    }
}
