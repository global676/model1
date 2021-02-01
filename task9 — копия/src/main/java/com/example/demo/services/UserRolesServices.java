package com.example.demo.services;

import com.example.demo.domain.User;

import java.util.Map;

public interface UserRolesServices extends BaseServices<User> {

    Map<Integer, User> findAll();

    User getFullUserWithQuery(int id);

    User getFullUserWithQueryFromLoginAndPass(String login, String password);
}
