package hello.springmvc.basic.controller;

import hello.springmvc.basic.domain.Student;
import hello.springmvc.basic.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/list.do")
    public String list(Model model) {
        List<Student> students = studentService.getStudents();
        model.addAttribute("students", students);
        return "student/list";
    }

    @GetMapping("/form.do")
    public String form() {
        return "student/form";
    }

    @GetMapping("/login.do")
    public String loginForm() {
        return "student/login";
    }

    @PostMapping("/login.do")
    public String login(Model model, Student student) {
        Student studentInfo = studentService.findByStudent(student);
        if (studentInfo == null) {
            return "student/login";
        }

        model.addAttribute("student", studentInfo);
        return "student/info";
    }

    @PostMapping("/reg.do")
    public String form(Student student) {
        studentService.regStudent(student);

        return "redirect:/students/list.do";
    }

    @GetMapping("/remove.do")
    public String remove() {
        studentService.removeStudent();

        return "student/list";
    }
}
