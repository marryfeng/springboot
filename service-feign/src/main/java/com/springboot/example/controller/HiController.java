package com.springboot.example.controller;

import com.springboot.example.service.ScheduleFeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/19.
 */
@RestController
public class HiController {
    @Autowired
    ScheduleFeignInterface scheduleFeignInterface;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return scheduleFeignInterface.sayHiFromClientOne(name);
    }
}
