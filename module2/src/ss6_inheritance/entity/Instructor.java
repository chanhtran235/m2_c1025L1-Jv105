package ss6_inheritance.entity;

public class Instructor extends Person {
    private double salary;

    public Instructor() {

    }
    public Instructor(int id, String name, String address, double salary) {
        super(id, name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                super.toString()+
                "salary=" + salary +
                '}';
    }
}
