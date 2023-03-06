package com.example.patterns.CreationalPatterns.FactoryDesignPattern.factory;


import com.example.patterns.CreationalPatterns.FactoryDesignPattern.Impl.AdditionOperationImpl;
import com.example.patterns.CreationalPatterns.FactoryDesignPattern.Impl.ProductOperationImpl;
import com.example.patterns.CreationalPatterns.FactoryDesignPattern.MathematicalOperation;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@NoArgsConstructor
public class MathematicalOperationFactory implements ApplicationContextAware {

    private static ApplicationContext applicationContext;
    public MathematicalOperation getOperation(String operation){
        if(operation.equalsIgnoreCase("sum")){
            return applicationContext.getBean(AdditionOperationImpl.class);
        }else if(operation.equalsIgnoreCase("product")){
            return  applicationContext.getBean(ProductOperationImpl.class);
        }else {
            log.error("operation {} is invalid ",operation);
            return null;
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}
