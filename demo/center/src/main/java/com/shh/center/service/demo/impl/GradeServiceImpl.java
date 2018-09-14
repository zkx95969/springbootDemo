package com.shh.center.service.demo.impl;

import com.shh.center.entity.demo.Grade;
import com.shh.center.repository.demo.GradeRepository;
import com.shh.center.service.demo.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description :
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GradeServiceImpl implements GradeService{
    @Autowired
    private GradeRepository gradeRepository;


    @Override
    public Grade findOne(Long id) {
        return gradeRepository.findOne(id);
    }
}