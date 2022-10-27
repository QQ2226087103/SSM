package cn.ink.mapper;

import cn.ink.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    List<Student> getAll();

    Student get(@Param("studentName") String studentName, @Param("loginPwd") String loginPwd);
}
