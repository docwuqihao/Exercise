package com.example.demo.delegate.cglib;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Person {

    public void sayHi() {
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Hi!!!");
    }

    public void sayBye() {
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Bye!!!");
    }
}
