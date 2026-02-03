package ss6_inheritance.serivice;

import ss6_inheritance.entity.Instructor;
import ss6_inheritance.repository.IInstructorRepository;
import ss6_inheritance.repository.InstructorRepository;

public class InstructorService implements IInstructorService{
    private IInstructorRepository instructorRepository = new InstructorRepository();
    @Override
    public Instructor[] findAll() {
        return instructorRepository.findAll();
    }

    @Override
    public void add(Instructor instructor) {
         instructorRepository.add(instructor);
    }
}
