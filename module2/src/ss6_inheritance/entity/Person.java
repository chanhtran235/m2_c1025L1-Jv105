package ss6_inheritance.entity;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private int id;
    private String name;
    transient private String address;

    public Person() {

    }

    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String getInfoToCSV();

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name +
                ", address='" + address;
    }
}
