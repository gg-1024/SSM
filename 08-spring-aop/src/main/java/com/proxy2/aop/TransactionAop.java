package com.proxy2.aop;

public class TransactionAop implements Aop {
    @Override
    public void before() {
        System.out.println("开启事务.....");
        System.out.println("开始日志");
    }

    @Override
    public void after() {
        System.out.println("提交事务.....");
    }
}
