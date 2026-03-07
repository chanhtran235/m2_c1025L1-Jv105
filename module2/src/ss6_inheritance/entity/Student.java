package ss6_inheritance.entity;

import java.io.Serializable;

public class Student extends Person implements Comparable<Student> {
    private float score;
    private String Email;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    public Student() {
    }

    public Student(int id, String name, String address) {
        super(id, name, address);
    }

    public Student(int id, String name, String address, float score) {
        super(id, name, address);
        this.score = score;
    }
    @Override
    public String getInfoToCSV() {
        return this.getId()+","+this.getName()+","+this.getAddress()+","+this.getScore();
    }

    @Override
    public String toString() {
        return "Sinnh viên{" +
                super.toString()+
                " score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.getId()==o.getId()){
            return this.getName().compareTo(o.getName());
        }
        return this.getId()-o.getId();
    }

}

