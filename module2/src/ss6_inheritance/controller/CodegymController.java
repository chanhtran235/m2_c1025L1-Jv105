package ss6_inheritance.controller;

import java.util.Scanner;

public class CodegymController {
    public void displayMenu() {
        final int STUDENT = 1;
        final int INSTRUCTOR = 2;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Hệ thống quản lý Codegym--------------" +
                    "\n 1.Quản lý sinh viên" +
                    "\n 2.Quản lý giáo viên" +
                    "\n 3.Thoát");
            System.out.println("---Chọn chức năng------------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case STUDENT:
                    StudentController studentController = new StudentController();
                    studentController.displayMenu();
                    break;
                case INSTRUCTOR:
                    InstructorController instructorController = new InstructorController();
                    instructorController.displayMenu();
                    break;
                default:
                    flag = false;
            }
        }
    }
}
