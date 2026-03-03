package ss10;

import ss6_inheritance.entity.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>(); // kiểu lưu  trữ : Object
        List<Integer> list1 = new ArrayList<>();
        Box<Integer> box = new Box<>();
        box.setT(10);
        System.out.println(box.getT());

        Box<Student> studentBox = new Box<>();
        studentBox.setT(new Student());
        System.out.println(studentBox.getT());
        method1(new Student());
        method1(10);

    }

    public  static <T> void method1(T t){
        System.out.println(t);
    }

}
