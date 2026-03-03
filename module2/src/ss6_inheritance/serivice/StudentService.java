package ss6_inheritance.serivice;

import ss6_inheritance.entity.Student;
import ss6_inheritance.repository.IStudentRepository;
import ss6_inheritance.repository.StudentRepository;

import java.util.Collections;
import java.util.List;

public class StudentService implements IStudentService{
    private IStudentRepository studentRepository = new StudentRepository();
    // các method CRUD :
    @Override
    public List<Student> findAll() {
        // xử lý nghiệp vụ nêu có trước khi trả về tro controller hoặc gọi xuống repository
            List<Student> students = studentRepository.findAll();
            // ví dụ sắp xếp theo tên => xử lý nghiệp vụ.
        Collections.sort(students);
        return students;
    }

    @Override
    public void add(Student student) {
        // có  thể xử lý nghiệp vụ ở đây
        // ví dụ kiểm tra id đã tồn tại chưa
      studentRepository.add(student);
    }

    @Override
    public boolean deleteById(int id) {
        // kiểm tra id có tồn tại hay không?
        List<Student> studentList = findAll();
        boolean checkId = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()){
                checkId = true;
                break;
            }
        }
        if (checkId){
            // nếu tồn tại gọi repo xoá
            return studentRepository.deleteById(id);
        }else {
            return false;
        }

    }


}
