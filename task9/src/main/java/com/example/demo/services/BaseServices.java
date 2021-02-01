package com.example.demo.services;

import java.util.Map;

public interface BaseServices<T> {
    Map<Integer,T> findAll();
}
