package ss6_inheritance.entity;

public class Student extends Person {
    private float score;

    public Student() {
    }

    public Student(int id, String name, String address) {
        super(id, name, address);
    }

    public Student(int id, String name, String address, float score) {
        super(id, name, address);
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sinnh viên{" +
                super.toString()+
                " score=" + score +
                '}';
    }
}

