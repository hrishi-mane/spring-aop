package com.example.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyCloudLoggingAspect {

    @Before("AopExpressions.forServicePackageNoGetterSetters()")
    public void logToCloud() {
        System.out.println("=========> This is logging to cloud");
    }


}
