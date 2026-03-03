package ss6_inheritance.repository;

import ss6_inheritance.entity.Student;
import ss6_inheritance.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    // để kết nối database hoặc đọc ghi file
    // trươc tiên giả lập nơi lưu trữ
    private final String STUDENT_FILE = "src/ss6_inheritance/data/student.csv";

    @Override
    public List<Student> findAll() {
        // đọc  file hoặc kết nối DB
        List<Student> studentList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSVToStringList(STUDENT_FILE);
        // chuyển đổi stringList => studentList
        String[] array = null;
        for (String line : stringList) {
            //2,Tiến,QN,8.0
            array = line.split(",");
            Student student = new Student(Integer.parseInt(array[0]), array[1], array[2], Float.parseFloat(array[3]));
            studentList.add(student);
        }
        return studentList;
    }

    @Override
    public void add(Student student) {
        List<String> stringList = new ArrayList<>();
        stringList.add(student.getInfoToCSV());
        // ghi file
        ReadAndWriteFile.writeStringListToCSV(STUDENT_FILE, stringList, true);
    }

    @Override
    public boolean deleteById(int id) {
        List<Student> studentList = findAll();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() != id) {
                // đổi studentList => stringList ( với các student không bị xoá)
                stringList.add(studentList.get(i).getInfoToCSV());
            }
        }
        ReadAndWriteFile.writeStringListToCSV(STUDENT_FILE,stringList,false );
        return true;
    }
}
