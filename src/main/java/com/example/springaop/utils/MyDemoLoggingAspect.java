package com.example.springaop.utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Pointcut("execution(public * add*(..))")
    private void forMethodsStartingWithAdd() {
    }

    @Before("forMethodsStartingWithAdd()")
    public void beforeAddAdvice() {
        System.out.println("\n =========> Executing @Before advice on all methods starting with add");
    }

}
