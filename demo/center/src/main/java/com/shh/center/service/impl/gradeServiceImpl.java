package com.shh.center.service.impl;

import com.shh.center.entity.Grade;
import com.shh.center.entity.Student;
import com.shh.center.repository.GradeRepository;
import com.shh.center.repository.StudentRepository;
import com.shh.center.service.GradeService;
import com.shh.center.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Author: wujun
 * @CreateDate: 2018/9/13 15:06
 * @Version: 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class gradeServiceImpl implements GradeService{
    @Autowired
    private GradeRepository gradeRepository;


    @Override
    public Grade findOne(Long id) {
        return gradeRepository.findOne(id);
    }
}