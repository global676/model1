package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@Mapper
public interface RolesMapper<T> extends BaseMapper<T> {
    Set<T> findAll();
}
