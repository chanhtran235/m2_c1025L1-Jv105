package ss6_inheritance.repository;

import ss6_inheritance.entity.Student;

public class StudentRepository implements IStudentRepository{
    // để kết nối database hoặc đọc ghi file
    // trươc tiên giả lập nơi lưu trữ
    static private Student[]  students = new Student[100];
    static {
       students[0] = new Student(1,"chánh","DN",7.0f);
       students[1] = new Student(2,"chánh2","DN",7.0f);
       students[2] = new Student(3,"chán3","DN",7.0f);
    }
    @Override
    public Student[] findAll() {
        // đọc  file hoặc kết nối DB
        return students;
    }

    @Override
    public void add(Student student) {
        // ghi file
        for (int i = 0; i <students.length ; i++) {
            if (students[i]==null){
                students[i] = student;
                break;
            }
        }
    }
}
