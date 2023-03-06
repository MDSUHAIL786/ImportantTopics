package com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.UsingFactoryPattern.Factory;

import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.StudentBuilder;
import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.UsingFactoryPattern.Impl.EnggStdsBuilder;
import com.example.patterns.CreationalPatterns.BuilderPattern.AnotherExample.UsingFactoryPattern.Impl.MbaStdsBuilder;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class StudentFactory implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public static StudentBuilder getStudentBuilder(String studentCourse){
        if(studentCourse.equalsIgnoreCase("Engineering")){
            return applicationContext.getBean(EnggStdsBuilder.class);
        }else if(studentCourse.equalsIgnoreCase("MBA")){
            return applicationContext.getBean(MbaStdsBuilder.class);
        }else{
            return null;
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}
