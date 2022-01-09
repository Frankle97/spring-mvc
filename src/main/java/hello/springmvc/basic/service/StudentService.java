package hello.springmvc.basic.service;

import hello.springmvc.basic.domain.Student;
import hello.springmvc.basic.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentMapper studentMapper;

    public List<Student> getStudents() {
        return studentMapper.getStudents();
    }

    public Integer regStudent(Student student) {
        return studentMapper.regStudent(student);
    }

    public Student findByStudent(Student student) {
        return studentMapper.findByStudent(student);
    }

    public Integer removeStudent() {
        return studentMapper.removeStudent();
    }
}
