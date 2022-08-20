package com.proxy1;

import com.proxy1.aop.TransactionAop;
import com.proxy1.service.BookService;
import com.proxy1.service.BookServiceImpl;
import com.proxy1.service.Service;

public class Client {
    public static void main(String[] args) {
        Service service = new BookServiceImpl(new BookService(),new TransactionAop());
        service.show();
    }
}
