package ss10;


import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        // lưu thông tin vắng nghỉ của hoc viên: key = Student, value = số buổi vắng ngỉ
        Map<Student,Integer> studentIntegerMap = new TreeMap<>();
        studentIntegerMap.put(new Student(1,"chánh","DN"),2);
        studentIntegerMap.put(new Student(4,"hải","DN"),1);
        studentIntegerMap.put(new Student(3,"tiến","DN"),4);

        studentIntegerMap.put(new Student(1,"chánh4","DN"),22);

        // duyệt Map:
        // + cách 1
//        Set<Student> studentSet = studentIntegerMap.keySet();
//        for (Student student : studentSet){
//            // tên : số buổi vắng nghỉ:
//            System.out.println(student.getName() + " : "+ studentIntegerMap.get(student) );
//        }
        System.out.println("---------------------------------");
         // Cách 2:
       Set<Map.Entry<Student,Integer>> entries = studentIntegerMap.entrySet();
        for (Map.Entry<Student,Integer> entry: entries){
//            System.out.println(entry.getKey().hashCode());
            System.out.println(entry.getKey()+ ": "+ entry.getValue());
        }

    }
}
