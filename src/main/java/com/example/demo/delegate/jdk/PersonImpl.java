package com.example.demo.delegate.jdk;

import com.example.demo.delegate.Speakable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonImpl implements Speakable {

    @Override
    public void sayHi() {
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Hi!!!");
    }

    @Override
    public void sayBye() {
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Bye!!!");
    }

}
