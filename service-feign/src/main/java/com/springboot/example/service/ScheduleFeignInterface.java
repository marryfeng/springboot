package com.springboot.example.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/9/19.
 */
@FeignClient(value="service-hi",fallback = ScheduleFeignImpl.class)
public interface ScheduleFeignInterface {

    @RequestMapping(value="hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
