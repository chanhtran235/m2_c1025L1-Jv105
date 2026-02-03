package ss6_inheritance.repository;

import ss6_inheritance.entity.Student;

public interface IStudentRepository {

    Student[] findAll();
    void add(Student student);
}
