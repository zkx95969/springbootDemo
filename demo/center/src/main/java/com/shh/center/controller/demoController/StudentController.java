package com.shh.center.controller.demoController;

import com.shh.center.entity.Grade;
import com.shh.center.entity.Student;
import com.shh.center.service.GradeService;
import com.shh.center.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @description :
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private GradeService gradeService;
    @RequestMapping("/find/{id}")
    public Student findOne(@PathVariable("id") Long id){
        return studentService.findById(id);
    }
    @RequestMapping("/find/{name}/{age}")
    public List<Student> findByNameAndAge(@PathVariable("name")String name,@PathVariable("age")String age){
        return studentService.findBynameAndAge(name,age);
    }
    @RequestMapping("/update/{id}/{name}")
    public Student updatenameById(@PathVariable("id")Long id,@PathVariable("name")String name){
        return studentService.updateStuNameById(id,name);
    }
    @RequestMapping("/findAll")
    public List<Student> findAll(){
        System.out.println("----------------------------------");
        return studentService.findAllStu();
    }
    @RequestMapping("/insert")
    public Student insert(Long gradeId,Student student){
        Grade grade = gradeService.findOne(gradeId);
        if(grade==null){
            return null;
        }
        student.setGrade(grade);
        student.setCreateTime(new Date());
        return studentService.update(student);
    }
}