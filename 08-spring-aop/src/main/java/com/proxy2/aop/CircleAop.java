package com.proxy2.aop;

public class CircleAop implements Aop{
    @Override
    public void before() {
        System.out.println("执行前说一声");
    }

    @Override
    public void runtime() {

    }

    @Override
    public void after() {
        System.out.println("执行后关门");
    }
}
