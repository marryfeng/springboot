package com.springboot.example.Service;

import com.springboot.example.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2017/9/12.
 */
public interface StudentService {

    List<Student> getList();
    Student selectStudentById(Integer id);


}
