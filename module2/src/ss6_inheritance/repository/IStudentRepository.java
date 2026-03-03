package ss6_inheritance.repository;

import ss6_inheritance.entity.Student;

import java.util.List;

public interface IStudentRepository extends IRepository<Student> {
    boolean deleteById(int id);
}
