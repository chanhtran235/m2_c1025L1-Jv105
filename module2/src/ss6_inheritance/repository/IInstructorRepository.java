package ss6_inheritance.repository;

import ss6_inheritance.entity.Instructor;
import ss6_inheritance.entity.Student;

public interface IInstructorRepository {
    Instructor[] findAll();
    void add(Instructor instructor);
}
