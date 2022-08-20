package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspects {

    @Before(value = "execution(public * com.service.*.*.*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
        System.out.println("切点的前置增强方法");
    }
}
