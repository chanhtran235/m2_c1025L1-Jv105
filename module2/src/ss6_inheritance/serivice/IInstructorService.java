package ss6_inheritance.serivice;

import ss6_inheritance.entity.Instructor;
import ss6_inheritance.entity.Student;

public interface IInstructorService {
    Instructor[] findAll();
    void add(Instructor instructor);
}
