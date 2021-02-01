package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@Mapper
public interface UserAndRolesMapper<T> extends BaseMapper<T>{

    Set<T> findAll();

    User getFullUserWithQuery(int userId);

    User getFullUserWithQueryFromLoginAndPass(String login, String password);

}
