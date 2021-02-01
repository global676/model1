package com.example.demo.dao;

import java.util.Set;

public interface BaseMapper<T> {

    Set<T> findAll();
}
