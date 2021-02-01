package com.example.demo.services;

import java.util.Set;

public interface UserServices {
    void deleteUserFromDB(int id);

    void editUserInDB(int userId, String login, String password);

    void addUserInDB( String login, String password);

    void deleteUserRoles(Integer userId);

    void addUserRoles(Integer userId, Set<Integer> roleIds);
}
