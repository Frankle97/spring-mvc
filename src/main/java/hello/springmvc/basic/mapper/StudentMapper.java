package hello.springmvc.basic.mapper;

import hello.springmvc.basic.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> getStudents();

    Integer regStudent(Student student);

    Student findByStudent(Student student);

    Integer removeStudent();

}
