package com.example.springshiro.service;

import com.example.springshiro.domain.entity.Permission;
import com.example.springshiro.domain.entity.Role;
import com.example.springshiro.domain.entity.User;


public interface IService {
    int saveUser(User user);
    int saveRole(Role role);
    int savePermission(Permission permission);
}
