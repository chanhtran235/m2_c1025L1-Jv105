package ss6_inheritance.controller;

import ss6_inheritance.entity.Student;
import ss6_inheritance.serivice.IStudentService;
import ss6_inheritance.serivice.StudentService;
import ss6_inheritance.view.StudentView;

import java.util.Scanner;

public class StudentController {
    private IStudentService studentService = new StudentService();

    public void displayMenu() {
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Quản lý sinh viên--------------" +
                    "\n 1.Danh sách" +
                    "\n 2.Thêm mới" +
                    "\n 3.Xoá" +
                    "\n 4.Tìm kiếm" +
                    "\n 5.Thoát");
            System.out.println("---Chọn chức năng------------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    // goi servcie để lấy dữ liệu
                    Student[] students = studentService.findAll();
                    // gọi View để hiển thị
                    StudentView.displayStudentList(students);
                    break;
                case ADD:
                    // goi view để nhập dữ liệu
                   Student student = StudentView.inputDataForStudent();
                   // goi service để thêm mới
                    studentService.add(student);
                    System.out.println("Thêm mới thành công");
                    break;
                case DELETE:
                    System.out.println("Đây là chức năng xoá");
                    break;
                case SEARCH:
                    System.out.println("Đây là chức năng tìm kiếm");
                    break;
                default:
                    flag = false;
            }
        }
    }
}
