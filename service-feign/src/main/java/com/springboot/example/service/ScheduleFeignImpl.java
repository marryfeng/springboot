package com.springboot.example.service;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/19.
 */
@Component
public class ScheduleFeignImpl implements  ScheduleFeignInterface {

    @Override
    public String sayHiFromClientOne(String name) {
        return "SORRY"+name;
    }
}
