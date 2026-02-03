package ss6_inheritance.serivice;

import ss6_inheritance.entity.Student;
import ss6_inheritance.repository.IStudentRepository;
import ss6_inheritance.repository.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService{
    private IStudentRepository studentRepository = new StudentRepository();
    // các method CRUD :
    @Override
    public Student[] findAll() {
        // xử lý nghiệp vụ nêu có trước khi trả về tro controller hoặc gọi xuống repository
            Student[] students = studentRepository.findAll();
            // ví dụ sắp xếp theo tên => xử lý nghiệp vụ.
        return students;
    }

    @Override
    public void add(Student student) {
        // có  thể xử lý nghiệp vụ ở đây
        // ví dụ kiểm tra id đã tồn tại chưa
      studentRepository.add(student);
    }


}
