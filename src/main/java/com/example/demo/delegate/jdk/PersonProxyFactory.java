package com.example.demo.delegate.jdk;

import com.example.demo.delegate.Speakable;

public class PersonProxyFactory {
    public static Speakable newJdkProxy() {
        DynamicProxy dynamicProxy = new DynamicProxy(new PersonImpl());
        Speakable proxy = dynamicProxy.getProxy();
        return proxy;
    }
}
