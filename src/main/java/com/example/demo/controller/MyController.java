package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.jlamb.MyService;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/test")
    public String test(){
        return myService.test();

    }
}
