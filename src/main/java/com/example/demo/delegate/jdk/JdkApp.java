package com.example.demo.delegate.jdk;

import com.example.demo.delegate.Speakable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JdkApp {

    public static void main(String[] args) {
        log.info("******* jdk proxy *******");

        Speakable speakable = PersonProxyFactory.newJdkProxy();
        speakable.sayHi();
        speakable.sayBye();
    }
}
