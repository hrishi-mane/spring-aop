package com.example.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class AopExpressions {

    @Pointcut("execution(public * com.example.springaop.service.*.*(..))")
    private void forServiceClassMethods() {
    }

    @Pointcut("execution(public * com.example.springaop.service.*.get*(..))")
    private void forGetters() {
    }

    @Pointcut("execution(public * com.example.springaop.service.*.set*(..))")
    private void forSetters() {
    }

    @Pointcut("forServiceClassMethods() && !(forGetters() || forSetters())")
    public void forServicePackageNoGetterSetters() {
    }
}
