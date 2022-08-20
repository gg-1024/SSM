package com.proxy2.service;


public class BookService implements Service {
    @Override
    public void show() {
        System.out.println("展示所有图书");
    }
}
