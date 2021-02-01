package com.example.demo.services;

import com.example.demo.domain.User;
import org.springframework.stereotype.Service;


import com.example.demo.dao.UserAndRolesMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserRolesServicesImpl extends BaseServicesImpl<User> implements UserRolesServices {
    @Autowired
    private UserAndRolesMapper<User> userAndRolesMapper;

    public UserRolesServicesImpl(UserAndRolesMapper<User> userAndRolesMapper) {
        this.userAndRolesMapper = userAndRolesMapper;
    }

//    @Override
//    public Map<Integer, Users> getAllUsers() {
//        Map<Integer, Users> usersMap = new HashMap<>();
//        for (Users n : userAndRolesMapper.getAllUsers()) {
//            usersMap.put(n.getId(), n);
//        }
//        return usersMap;
//    }

    @Override
    public User getFullUserWithQuery(int id) {
        return userAndRolesMapper.getFullUserWithQuery(id);
    }

    @Override
    public User getFullUserWithQueryFromLoginAndPass(String login, String password) {
        return userAndRolesMapper.getFullUserWithQueryFromLoginAndPass(login,password);
    }

    @Override
    public Map<Integer, User> findAll() {
        Map<Integer, User> usersMap = new HashMap<>();
        for (User n : userAndRolesMapper.findAll()) {
            usersMap.put(n.getId(), n);
        }
        return usersMap;
    }

}
