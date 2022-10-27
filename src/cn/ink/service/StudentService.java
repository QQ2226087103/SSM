package cn.ink.service;

import cn.ink.entity.Student;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface StudentService {

    List<Student> getAll();

    Student get(@Param("studentName")String studentName, @Param("loginPwd")String loginPwd);
}
