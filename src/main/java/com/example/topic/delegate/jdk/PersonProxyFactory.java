package com.example.topic.delegate.jdk;

import com.example.topic.delegate.Speakable;

public class PersonProxyFactory {
    public static Speakable newJdkProxy() {
        DynamicProxy dynamicProxy = new DynamicProxy(new PersonImpl());
        Speakable proxy = dynamicProxy.getProxy();
        return proxy;
    }
}
