package com.example.topic.delegate.cglib;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CglibApp {

    public static void main(String[] args) {
        log.info("****** cglib proxy ******");
        Person person = PersonProxyFactory.newCglibProxy();
        person.sayHi();
        person.sayBye();
    }
}
