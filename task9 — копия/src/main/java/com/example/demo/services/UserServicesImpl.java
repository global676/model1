package com.example.demo.services;

import com.example.demo.dao.UserAndRolesMapper;
import com.example.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserMapper userMapper;

    public UserServicesImpl(UserMapper UserMapper) {
        this.userMapper = UserMapper;
    }

    @Override
    public void deleteUserFromDB(int id) {
        userMapper.deleteUser(id);
    }

    @Override
    public void editUserInDB(int userId, String login, String password) {
        userMapper.updateUser(userId, login, password);
    }

    @Override
    public void addUserInDB(String login, String password) {
        userMapper.addUser(login, password);

    }

    @Override
    public void deleteUserRoles(Integer userId) {
        userMapper.deleteUserRoles(userId);
    }

    @Override
    public void addUserRoles(Integer userId, Set<Integer> roleIds) {
        for (int n : roleIds) {
            userMapper.addUserRoles(userId, n);
        }
    }
}
