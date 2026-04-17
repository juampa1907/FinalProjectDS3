package co.edu.unbosque.dao;

import java.util.List;


public interface DAO<E> {
    E save(E object);

    List<E> findAll();

    E findById(Integer id);

    void deleteById(Integer id);

    E update(E object);
}
