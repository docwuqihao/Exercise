package com.example.demo.delegate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonSpring implements Speakable {
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
