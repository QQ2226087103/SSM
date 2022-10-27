import cn.ink.entity.Student;
import cn.ink.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentServiceImplTest {

    @org.junit.Test
    public void selectAllStudent() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        StudentService studentService = (StudentService)applicationContext.getBean("studentService");
        for (Student student : studentService.getAll()) {
            System.out.println(student);
        }
    }
}