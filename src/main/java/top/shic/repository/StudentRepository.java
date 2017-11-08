package top.shic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.shic.domain.Student;

/**
 * Created by Administrator on 2017/11/5.
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {
    public Student findStudentByName(String name);
}
