package top.shic.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.shic.domain.Student;

/**
 * Created by Administrator on 2017/11/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = new Student("shi","123");
        studentRepository.save(student);
    }

//    @Test
//    public void findStudentByNameTest(){
//        Student o =  studentRepository.findStudentByName("shi");
//        System.out.println("This student'name:"+o.getName()+",Password:"+o.getPassword());
//    }

}
