package com.shh.center.service;

import com.shh.center.entity.Student;

import java.util.List;

/**
 * @description :
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
public interface StudentService {
    Student findById(Long id);
    List<Student> findBynameAndAge(String name,String age);
    Student updateStuNameById(Long id,String name);
    List<Student> findAllStu();
    Student save(Student stu);
    void removeStu(Long id);
    Student update(Student student);
}
