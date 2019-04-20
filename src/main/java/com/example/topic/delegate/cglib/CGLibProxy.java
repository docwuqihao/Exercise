package com.example.topic.delegate.cglib;

import java.lang.reflect.Method;

import com.example.topic.delegate.MonitorSession;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CGLibProxy implements MethodInterceptor {
    private static CGLibProxy instance = new CGLibProxy();

    private Enhancer enhancer = new Enhancer();

    private CGLibProxy() {
    }

    public static CGLibProxy getInstance() {
        return instance;
    }

    public <T> T getProxy(Class<T> clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy)
            throws Throwable {
        MonitorSession.begin(method.getName());
        Object obj = methodProxy.invokeSuper(o, args);
        MonitorSession.end();
        return obj;
    }
}
