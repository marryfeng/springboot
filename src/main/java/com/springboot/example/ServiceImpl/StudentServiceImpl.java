package com.springboot.example.ServiceImpl;

import com.springboot.example.Dao.StudentMapper;
import com.springboot.example.Service.StudentService;
import com.springboot.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/12.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getList() {

        return studentMapper.getListStudent();
    }

    @Override
    public Student selectStudentById(Integer id) {
        return studentMapper.selectStudentById(id);
    }
}
