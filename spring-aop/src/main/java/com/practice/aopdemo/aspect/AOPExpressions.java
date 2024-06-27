package com.practice.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPExpressions {

    @Pointcut("execution(* com.practice.aopdemo.dao.*.*(..))")
    public void forDAOPackage(){}

    @Pointcut("execution(* com.practice.aopdemo.dao.*.get*(..))")
    public void getter(){}

    @Pointcut("execution(* com.practice.aopdemo.dao.*.set*(..))")
    public void setter(){}

    @Pointcut("forDAOPackage() && !(getter() || setter())")
    public void forDAOPackageNoGetterAndSetter(){}
}
