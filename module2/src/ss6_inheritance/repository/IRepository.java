package ss6_inheritance.repository;

import ss6_inheritance.entity.Instructor;

import java.util.List;

public interface IRepository<T> {
    List<T> findAll();
    void add(T t);
}
