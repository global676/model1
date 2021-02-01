package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    void deleteUser(int id);

    void updateUser(int id, String login, String password);

    void deleteUserRoles(int id);

    void addUser(String login, String password);

    void addUserRoles(int userId, int rolesId);
}
