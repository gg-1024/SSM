package com.proxy2;

import com.proxy2.aop.CircleAop;
import com.proxy2.service.Service;
import com.proxy2.aop.TransactionAop;
import com.proxy2.service.BookService;
import com.proxy2.service.ProxyFactory;

public class Client {
    public static void main(String[] args) {
        Service service = (Service) ProxyFactory.getInstance(new BookService(),new CircleAop());
        service.show();
    }
}
