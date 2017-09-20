package com.springboot.example.controller;

import com.springboot.example.service.RibbonTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/19.
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonTest ribbonTest;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return ribbonTest.hiService(name);
    }
}
