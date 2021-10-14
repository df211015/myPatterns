package com.example.permissiondata.dto;

import lombok.Data;

import java.util.List;

@Data
public class AccountRoleData {
    //账号id
    private String accountId;
    //角色列表
    private List<String> roles;
}
