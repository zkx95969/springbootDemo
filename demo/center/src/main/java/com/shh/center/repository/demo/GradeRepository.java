package com.shh.center.repository.demo;

import com.shh.center.entity.demo.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
public interface GradeRepository extends JpaRepository<Grade,Long> {
}
