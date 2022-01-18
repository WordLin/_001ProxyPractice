package com.example.dao;

import com.example.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {

    public List<Student> queryStu();

    public Student queryStu1(Integer id);


    List<Student> queryStu2(String s );

    void insertStu(Student stu);

    List<Map<String, Object>> queryStu3();

    List<Map<String, Object>> queryStu4();

    List<Student> queryStu5(Student s);

    List<Student> queryStu6(int[] arr);
}
