package com.shh.center.repository;

import com.shh.center.entity.Grade;
import com.shh.center.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @description:
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
public interface GradeRepository extends JpaRepository<Grade,Long> {
}
