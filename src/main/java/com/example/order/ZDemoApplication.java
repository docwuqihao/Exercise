package com.example.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.order.dao")
@ComponentScan("com.example")
public class ZDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZDemoApplication.class, args);
    }

}
