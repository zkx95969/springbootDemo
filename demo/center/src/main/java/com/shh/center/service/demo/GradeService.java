package com.shh.center.service.demo;

import com.shh.center.entity.demo.Grade;

/**
 * @description :
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
public interface GradeService {
    /**
     * 查询一个
     * @param id
     * @return
     */
    Grade findOne(Long id);
}
