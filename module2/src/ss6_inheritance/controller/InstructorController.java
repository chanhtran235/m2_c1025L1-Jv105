package ss6_inheritance.controller;

import ss6_inheritance.entity.Instructor;
import ss6_inheritance.entity.Student;
import ss6_inheritance.serivice.IInstructorService;
import ss6_inheritance.serivice.InstructorService;
import ss6_inheritance.view.InstructorView;
import ss6_inheritance.view.StudentView;

import java.util.Scanner;

public class InstructorController {
    private IInstructorService instructorService = new InstructorService();
    public void displayMenu() {
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Quản lý giáo viên--------------" +
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
                    Instructor[] instructors = instructorService.findAll();
                    // gọi View để hiển thị
                    InstructorView.displayInstructorList(instructors);
                    break;
                case ADD:
                    // goi view để nhập dữ liệu

                    // goi service để thêm mới

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
