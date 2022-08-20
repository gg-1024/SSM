package com.proxy2.aop;

public interface Aop {
    default void before(){};
    default void runtime(){};
    default void after(){};
}
