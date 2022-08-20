package com.proxy1.aop;

public interface Aop {
    default void before(){};
    default void runtime(){};
    default void after(){};
}
