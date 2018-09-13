package com.shh.center.service;

import com.shh.center.entity.Student;

import java.util.List;

/**
 * @Description:
 * @Author: wujun
 * @CreateDate: 2018/9/13 15:03
 * @Version: 1.0
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
