package com.proxy2.service;

import com.proxy2.aop.Aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static Object getInstance(Service service, Aop aop){
        return Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                aop.before();
                Object obj =  method.invoke(service,args);
                aop.after();

                return obj;
            }
        });
    }
}
