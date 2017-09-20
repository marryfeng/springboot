package com.springboot.example.Controller;

import com.springboot.example.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/11.
 */
@RestController
public class Controller {

    private static final Logger logger= LoggerFactory.getLogger(Controller.class);

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String getDemo(){
        return "hello";
    }

    @RequestMapping("list")
    public List<Student> showPojo(){
        logger.info("springboot展示list集合");
        Student s1=new Student();
        s1.setId(1);
        s1.setSname("张三");
        s1.setAge(10);

        Student s2=new Student();
        s2.setId(2);
        s2.setSname("李四");
        s2.setAge(12);
        List<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        return list;

    }

    @RequestMapping("pojo")
    public Student pojo(){
        logger.info("spirngboot展示pojo对象");
        Student s1=new Student();
        s1.setId(1);
        s1.setSname("张三");
        s1.setAge(10);
        return s1;



    }

}
