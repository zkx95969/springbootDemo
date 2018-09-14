package com.shh.center.service.demo;

import com.shh.center.entity.demo.Student;

import java.util.List;

/**
 * @description :
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
public interface StudentService {
    /**
     * 查询一个
     * @param id
     * @return
     */
    Student findById(Long id);

    /**
     * 指定条件查询
     * @param name
     * @param age
     * @return
     */
    List<Student> findBynameAndAge(String name,String age);

    /**
     * 指定条件修改
     * @param id
     * @param name
     * @return
     */
    Student updateStuNameById(Long id,String name);

    /**
     * 查询所有
     * @return
     */
    List<Student> findAllStu();

    /**
     * 添加
     * @param stu
     * @return
     */
    Student save(Student stu);

    /**
     * 删除
     * @param id
     */
    void removeStu(Long id);

    /**
     * 按实体类更新
     * @param student
     * @return
     */
    Student update(Student student);
}
