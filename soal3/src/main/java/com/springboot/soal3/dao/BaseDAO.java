package com.springboot.soal3.dao;

import java.util.List;

public interface BaseDAO<T> {
    T save(T param);

    T update(T param);

    int delete(T param);

    List<T> find();

    T findById(int id);
}
