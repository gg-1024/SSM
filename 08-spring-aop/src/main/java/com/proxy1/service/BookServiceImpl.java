package com.proxy1.service;

import com.proxy1.aop.Aop;

public class BookServiceImpl implements Service{

    Service service;
    Aop aop;

    public BookServiceImpl(Service service,Aop aop){
        this.service = service;
        this.aop = aop;
    }

    public void show(){
        aop.before();
        service.show();
        aop.after();
    }
}
