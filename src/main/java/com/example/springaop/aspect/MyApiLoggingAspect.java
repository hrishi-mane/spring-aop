package com.example.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyApiLoggingAspect {

    @Before("AopExpressions.forServicePackageNoGetterSetters()")
    public void performApiAnalytics() {
        System.out.println("=========> This is some analytics");
    }

}
