package ss4_object_class;

import java.util.Scanner;

public class StudentManager {
    static Student[]  students = new Student[10];
    static {
        students[0]= new Student(1,"chánh1");
        students[1]= new Student(2,"hải");
        students[2]= new Student(3,"minh");
    }
    // class chức năng chưa method CRUD
    public void display(){
        for (int i = 0; i <students.length ; i++) {
            if (students[i]!=null){
                System.out.println(students[i]);
            }else {
                break;
            }
        }
    }

    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhâp id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhâp tên");
        String name = scanner.nextLine();
        System.out.println("nhâp địa chỉ");
        String address = scanner.nextLine();
        Student student = new Student(id,name,address);
        for (int i = 0; i < students.length; i++) {
            if (students[i]==null){
                students[i]= student;
                break;
            }
        }
    }
}
