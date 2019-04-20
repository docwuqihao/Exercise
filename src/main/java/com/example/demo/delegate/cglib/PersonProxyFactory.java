package com.example.demo.delegate.cglib;

public class PersonProxyFactory {

    public static Person newCglibProxy() {
        CGLibProxy proxy = CGLibProxy.getInstance();
        Person personProxy = proxy.getProxy(Person.class);
        return personProxy;
    }
}
