package ss6_inheritance.view;


import ss6_inheritance.entity.Student;

import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayStudentList(Student[] students){
        for (int i = 0; i <students.length ; i++) {
            if (students[i]!=null){
                System.out.println(students[i]);
            }else {
                break;
            }
        }
    }

    public static Student inputDataForStudent() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm");
        float score = Float.parseFloat(scanner.nextLine());
        Student student = new Student(id,name,address,score);
        return student;
    }
}
