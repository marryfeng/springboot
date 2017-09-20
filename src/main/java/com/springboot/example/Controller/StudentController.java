package com.springboot.example.Controller;

import com.springboot.example.Service.StudentService;
import com.springboot.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/9/12.
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value="ssm",method = RequestMethod.GET)
    public List<Student> ssm(){
       return  studentService.getList();
    }
}
