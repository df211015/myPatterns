package com.example.springshiro.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.springshiro.dao.PermissionMapper;
import com.example.springshiro.dao.RoleMapper;
import com.example.springshiro.dao.UserMapper;
import com.example.springshiro.domain.entity.Permission;
import com.example.springshiro.domain.entity.Role;
import com.example.springshiro.domain.entity.User;
import com.example.springshiro.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ServiceImpl implements IService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public int saveUser(User user) {
        try {
            return this.userMapper.insert(user);
        } catch (Exception ex) {
            log.error(String.format("saveUser异常,入参:%s", JSON.toJSONString(user)), ex);
        }
        return -1;
    }

    @Override
    public int saveRole(Role role) {
        try {
            return this.roleMapper.insert(role);
        } catch (Exception ex) {
            log.error(String.format("saveRole异常,入参:%s", JSON.toJSONString(role)), ex);
        }
        return -1;
    }

    @Override
    public int savePermission(Permission permission) {
        try {
            return this.permissionMapper.insert(permission);
        } catch (Exception ex) {
            log.error(String.format("savePermission异常,入参:%s", JSON.toJSONString(permission)), ex);
        }
        return -1;
    }
}
