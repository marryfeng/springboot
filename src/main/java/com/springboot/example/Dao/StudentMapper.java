package com.springboot.example.Dao;

import com.springboot.example.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2017/9/12.
 */
@Mapper
public interface StudentMapper {
    List<Student> getListStudent();

    Student selectStudentById(Integer id);
}
