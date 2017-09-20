package com.springboot.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/9/19.
 */
@Service
public class RibbonTest {
    @Autowired
    RestTemplate restTemplate;

    @Value("${server.port}")
    public String hiService(String name){
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);

    }
}
