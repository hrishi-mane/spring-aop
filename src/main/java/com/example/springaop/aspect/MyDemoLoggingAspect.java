package com.example.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {

    @Before("AopExpressions.forServicePackageNoGetterSetters()")
    public void performLogging() {
        System.out.println("=========> This is debug logging");
    }

}
