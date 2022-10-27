package cn.ink.controller;

import cn.ink.entity.Student;
import cn.ink.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/studentController")
public class StudentController extends AbstractController {
    @Resource
    StudentService studentService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return null;
    }

    @PostMapping("/doLogin")
    public Object doLogin(@RequestParam("studentName") String studentName,@RequestParam("loginPwd") String loginPwd){
        Student student = new Student();
        student.setStudentName(studentName);
        student.setLoginPwd(loginPwd);
        Student student1 = studentService.get(studentName,loginPwd);
        if (student1!=null){
            return "index";
        }else {
            return "login";
        }
    }

    @RequestMapping("/list")
    public String getAllStudent(Model model, HttpSession session, @RequestParam()String studentName){
        return "index";
    }

}
