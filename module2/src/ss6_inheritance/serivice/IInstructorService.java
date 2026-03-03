package ss6_inheritance.serivice;

import ss6_inheritance.entity.Instructor;
import ss6_inheritance.entity.Student;

import java.util.List;

public interface IInstructorService {
    List<Instructor> findAll();
    void add(Instructor instructor);
}
