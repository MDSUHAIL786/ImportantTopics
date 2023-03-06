package com.example.patterns.CreationalPatterns.FactoryDesignPattern.Impl;


import com.example.patterns.CreationalPatterns.FactoryDesignPattern.MathematicalOperation;
import org.springframework.stereotype.Service;

@Service
public class AdditionOperationImpl implements MathematicalOperation {
    @Override
    public Integer applyOperation(int a, int b) {
        return a+b;
    }
}
