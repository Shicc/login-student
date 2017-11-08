package top.shic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import top.shic.domain.Student;
import top.shic.repository.StudentRepository;

import javax.validation.Valid;

/**
 * Created by Administrator on 2017/11/5.
 */
@Controller
public class StudentController extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
    }

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/login")
    public String login(Student student){
        return "login";
    }

    @PostMapping("/login")
    public String toLogin(@Valid Student student, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "login";
        }else {
            Student o = studentRepository.findStudentByName(student.getName());
            if(o==null){
                return "login";
            }else {
                if(student.getPassword().equals(o.getPassword())){
                    model.addAttribute("student",o);
                    return "success";
                }else {
                    return "login";
                }
            }
        }
    }

    @GetMapping("/register")
    public String register(Student student){
        return "register";
    }

    @PostMapping("/register")
    public String toRegister(@Valid Student student,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "register";
        }else {
            studentRepository.save(student);
            return "login";
        }
    }
}
