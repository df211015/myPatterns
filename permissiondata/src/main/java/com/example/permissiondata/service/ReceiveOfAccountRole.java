package com.example.permissiondata.service;

import com.alibaba.fastjson.JSON;
import com.example.permissiondata.constants.ProjConstants;
import com.example.permissiondata.dto.AccountRoleData;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

@Slf4j
//@Service("receiveOfAccountRole")
public class ReceiveOfAccountRole extends MyReceiver {
    //账号-角色数据文件
    private final String Account_Role_Data = "account_role_data";
    //易车角色-淘车角色对应关系
    private final String Role_Map_Data = "role_map_data";

    //易车账号-角色排重
    private Map mapRole = new LinkedHashMap<String, List<String>>();

    //易车账号-角色数据,聚合账号下的易车角色数据
    private List<AccountRoleData> lstAccountRole = new ArrayList<>();

    private final String insertTemplateSql = "insert into permission_role_user_relation(role_code,user_id,create_time,operater_name,is_delete) VALUES('%s','%s','%s','%s',%s);\r\n";

    @Autowired
    public ReceiveOfAccountRole() {
        super.getData();
    }

    /**
     * 初始化数据
     * 数据以#开头的为注释,实际数据初始化会忽略该行
     *
     * @throws IOException
     */
    @Override
    public void loadTaskFile() throws IOException {
        ClassPathResource classPathResourceOfAccount = new ClassPathResource(this.Account_Role_Data);
        InputStream inputStreamOfAccount = classPathResourceOfAccount.getInputStream();
        BufferedReader readerOfAccount = new BufferedReader(new InputStreamReader(inputStreamOfAccount, "UTF-8"));

        ClassPathResource classPathResourceOfRole = new ClassPathResource(this.Role_Map_Data);
        InputStream inputStreamOfRole = classPathResourceOfRole.getInputStream();
        BufferedReader readerOfRole = new BufferedReader(new InputStreamReader(inputStreamOfRole, "UTF-8"));

        String strRoleMapTmp;
        while ((strRoleMapTmp = readerOfRole.readLine()) != null) {
            if (StringUtils.isNotBlank(strRoleMapTmp)) {
                if (!strRoleMapTmp.startsWith("#")) {
                    String[] arrRole = strRoleMapTmp.split(":");
                    String ycRole = arrRole[0];
                    String[] arrTcRole = arrRole[1].split(",");
                    this.mapRole.put(ycRole, Arrays.asList(arrTcRole));
                }
            }
        }

        Integer iCount = 0;
        String strAccountTmp;
        while ((strAccountTmp = readerOfAccount.readLine()) != null) {
            if (StringUtils.isNotBlank(strAccountTmp)) {
                if (!strAccountTmp.startsWith("#")) {
                    String[] arrAccount = strAccountTmp.split(",");
                    String accountId = arrAccount[0];
                    String roleName = arrAccount[1];
                    iCount++;
                    Optional<AccountRoleData> first = this.lstAccountRole.stream().filter(r -> r.getAccountId().equals(accountId)).findFirst();
                    if (first.isPresent()) {
                        //存在账号则进行角色聚合
                        List<String> ycArrRoles = first.get().getRoles();
                        List<String> tcRoles = this.getTcRoles(roleName);
                        this.processTcRoles(first.get(), tcRoles);
                    } else {
                        //不存在账号则新建
                        AccountRoleData accountRoleData = this.buildAccountRoleData(arrAccount);
                        this.lstAccountRole.add(accountRoleData);
                    }
                    log.info(String.format("处理账号角色数据记录数量:%s", iCount));
                }
            }
        }

        readerOfAccount.close();
        readerOfRole.close();
    }

    /**
     * 获取账号角色信息
     *
     * @return
     */
    @Override
    public String process() {
        String myTime = super.getMyCalenderStr();
        StringBuilder sbSql = new StringBuilder();
        sbSql.append("-- 输出账号-权限角色sql脚本......\r\n");
        for (AccountRoleData item : this.lstAccountRole) {
            if (item.getRoles() != null && item.getRoles().size() > 0) {
                for (String roleName : item.getRoles()) {
                    sbSql.append(String.format(this.insertTemplateSql,
                            roleName, item.getAccountId(), myTime,
                            ProjConstants.OpereaterName, ProjConstants.Is_Delete));
                }
            }
        }
        String mySql = sbSql.toString();

        return mySql;
    }

    /**
     * 构建AccountRoleData
     *
     * @param arrAccount
     * @return
     */
    private AccountRoleData buildAccountRoleData(String[] arrAccount) {
        String accountId = arrAccount[0];
        String roleName = arrAccount[1];
        AccountRoleData accountRoleData = new AccountRoleData();
        accountRoleData.setAccountId(accountId);
        List<String> lstRoles = this.getTcRoles(roleName);
        accountRoleData.setRoles(lstRoles);

        return accountRoleData;
    }

    /**
     * 根据易车获取淘车角色列表
     *
     * @param ycRoleName
     * @return
     */
    private List<String> getTcRoles(String ycRoleName) {
        List<String> lstRoles = (List<String>) this.mapRole.get(ycRoleName);
        return lstRoles;
    }

    /**
     * 聚合指定账号下的淘车角色
     *
     * @param accountRoleData
     * @param tcRoles
     */
    private void processTcRoles(AccountRoleData accountRoleData, List<String> tcRoles) {
        try {
            List<String> roles = new ArrayList<>(accountRoleData.getRoles());
            if (null == accountRoleData.getRoles()) {
                roles = new ArrayList<>();
            }
            for (String tcRole : tcRoles) {
                if (!roles.contains(tcRole)) {
                    roles.add(tcRole);
                }
            }
            //重新赋值
            accountRoleData.setRoles(roles);
        } catch (Exception ex) {
            log.info(String.format("processTcRoles异常,数据:%s", JSON.toJSONString(accountRoleData)), ex);
        }
    }
}
