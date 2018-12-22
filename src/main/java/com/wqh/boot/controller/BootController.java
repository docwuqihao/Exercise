package com.wqh.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @RequestMapping("/greeting")
    public String hello(){
        return "Hello world.";
    }
}
