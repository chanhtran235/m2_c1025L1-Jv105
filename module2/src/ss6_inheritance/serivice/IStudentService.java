package ss6_inheritance.serivice;

import ss6_inheritance.entity.Student;

import java.util.List;

public interface IStudentService {
    Student[] findAll();
    void add(Student student);
}
