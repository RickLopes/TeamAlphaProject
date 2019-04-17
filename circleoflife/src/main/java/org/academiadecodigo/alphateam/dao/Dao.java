package org.academiadecodigo.alphateam.dao;

import org.springframework.ui.Model;

import java.util.List;

public interface Dao <T extends Model> {

    List<T> findAll();

    T findById(Integer id);

    T saveOrUpdate(T modelObject);

    void delete(Integer id);
}
