package com.shh.center.service.impl;

import com.shh.center.entity.Student;
import com.shh.center.repository.StudentRepository;
import com.shh.center.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description :
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findBynameAndAge(String name, String age) {
        return studentRepository.findListByNameAndAge(name,age);
    }

    @Override
    public Student updateStuNameById(Long id, String name) {
        return studentRepository.updateStuNameById(id,name);
    }

    @Override
    public List<Student> findAllStu() {
        //return studentRepository.findAll();
        return studentRepository.findAllStu();
    }

    @Override
    public Student save(Student stu) {
        return studentRepository.save(stu);
    }

    @Override
    public void removeStu(Long id) {
        studentRepository.delete(id);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

}