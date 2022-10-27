package cn.ink.service.impl;

import cn.ink.entity.Student;
import cn.ink.mapper.StudentMapper;
import cn.ink.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper studentMapper;

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    @Override
    public Student get(String studentName, String loginPwd) {
        return studentMapper.get(studentName,loginPwd);
    }
}
