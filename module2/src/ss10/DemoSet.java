package ss10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(new Student(3,"chánh2","ĐN"));
        studentSet.add(new Student(2,"chánh22","QN"));
        studentSet.add(new Student(4,"chánh4","ĐN"));
        studentSet.add(new Student(1,"chánh1","ĐN"));
        studentSet.add(new Student(2,"chánh2","ĐN"));

        for (Student student : studentSet){
            System.out.println(student);
        }
    }
}
