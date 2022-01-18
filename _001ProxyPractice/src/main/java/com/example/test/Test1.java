package com.example.test;

import com.example.dao.StudentDao;
import com.example.domain.Student;
import com.example.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);

/*        List<Student> list = dao.queryStu();
        list.forEach(student -> System.out.println("==== " + student));*/

        /*List<Student> list = dao.queryStu2("文");
        list.forEach(student -> System.out.println("========= " + student));*/
/*
        Student stu = new Student(null,"天天兄弟",55);
        dao.insertStu(stu);
        session.commit();*/

/*        List<Map<String,Object>> list  =  dao.queryStu3();

        for(Map map : list){
            Set<String> set = map.keySet();
            for(String s : set){
                System.out.println(s + " = " + map.get(s));
            }*/
      /*  List<Map<String,Object>> list = dao.queryStu4();

        for(Map map : list){
            Set<String> set = map.keySet();
            for(String s : set){
                System.out.println(s + " = " + map.get(s));
            }
    }*/

/*        Student s = new Student();
        s.setAge(55);
        List<Student> list = dao.queryStu5(s);

        list.forEach(student -> System.out.println("===== " + student));*/
        int[] arr = {1,2,3};
        List<Student> list = dao.queryStu6(arr);
        list.forEach(student -> System.out.println("====== " + student));
    }
}
