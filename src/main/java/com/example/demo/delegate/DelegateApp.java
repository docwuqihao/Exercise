package com.example.demo.delegate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;

//@Component
@Slf4j
public class DelegateApp {
    @Autowired
    private PersonSpring personSpring;

    //@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            log.info("******* xml aop ******");
            personSpring.sayHi();
            personSpring.sayBye();
            System.exit(0);
        };
    }

}
