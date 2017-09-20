package com.springboot.example.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/12.
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -1283386208231000845L;
    private Integer id;
    private String sname;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
