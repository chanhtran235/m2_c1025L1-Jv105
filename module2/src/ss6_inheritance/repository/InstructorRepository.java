package ss6_inheritance.repository;

import ss6_inheritance.entity.Instructor;

public class InstructorRepository implements IInstructorRepository{
    @Override
    public Instructor[] findAll() {
        return new Instructor[0];
    }

    @Override
    public void add(Instructor instructor) {

    }
}
