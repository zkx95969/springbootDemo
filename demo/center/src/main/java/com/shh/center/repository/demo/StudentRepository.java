package com.shh.center.repository.demo;

import com.shh.center.entity.demo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @description :
 * @author : wujun
 * @date : 2018/9/13 14:50
 * @version : 1.0
 */
public interface StudentRepository extends JpaRepository<Student,Long> {
    /**
     * 按固定命名格式写接口方法
     * @param id
     */
    Student findById(Long id);

    /**
     *按照传参数顺序进行选择参数
     */
    @Query("select s from Student s where s.name = ?1 and s.age = ?2")
    List<Student> findListByNameAndAge(String name,String age);
    /**
     * 按照参数名称进行选择
     */
    @Modifying
    @Query(value = "UPDATE Student SET name = :name WHERE id = :id")
    Student updateStuNameById(@Param("id") Long id, @Param("name") String name);

    @Query(value = "select * from student",nativeQuery = true)
    List<Student> findAllStu();
}
