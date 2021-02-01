package com.example.demo.services;

import com.example.demo.dao.RolesMapper;
import com.example.demo.domain.Roles;
import com.example.demo.dao.UserAndRolesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RolesServicesImpl implements RolesServices {
    @Autowired
    private RolesMapper<Roles> rolesMapper;

    public RolesServicesImpl(RolesMapper<Roles> rolesMapper) {
        this.rolesMapper = rolesMapper;
    }

    @Override
    public Map<Integer, Roles> findAll() {
        Map<Integer, Roles> rolesMap = new HashMap<>();
        for (Roles n : rolesMapper.findAll()) {
            rolesMap.put(n.getId(), n);
        }
        return rolesMap;
    }
}
