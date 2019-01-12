package com.wqh.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.wqh.boot.dao")
public class ZBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZBootApplication.class, args);
    }

}

