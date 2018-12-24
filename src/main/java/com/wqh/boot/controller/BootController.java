package com.wqh.boot.controller;

import java.util.concurrent.atomic.AtomicInteger;

import com.wqh.boot.vo.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class BootController {
    private static AtomicInteger count = new AtomicInteger(0);

    @RequestMapping("/hello")
    public Message hello(@RequestParam(name = "name", defaultValue = "world") String name) {
        return new Message(count.incrementAndGet(), String.format("Hello %s.", name));
    }
}
