package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.jlamb.MyConfig;
import vip.jlamb.MyService;

@Service
public class MyserviceImpl implements MyService {

    @Autowired
    private MyConfig myConfig;

    @Override
    public String test() {
        System.out.println(myConfig.getProperty1());
        System.out.println(myConfig.getProperty2());
        return myConfig.getProperty1() + myConfig.getProperty2();
    }
}
