package com.example.permissiondata.service;

import com.example.permissiondata.constants.ProjConstants;
import com.example.permissiondata.dto.DealerAccount;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Slf4j
public class ReceiveOfDealerAccountInfo extends MyReceiverExt {
    //账号数据文件
    private final String DEALER_ACCOUNT_INFO = "dealer_account_info";

    //账号信息
    private List<DealerAccount> lstDealerAccount = new ArrayList<>();

    private final String insertDealerAccountTemplateSql = "insert into dealer_account (channel,account_id, account_name,dealer_id,dealer_name, account_login_name, account_status,account_create_time, account_update_time) " +
            "values (%s,%s, '%s', %s,'%s','%s',%s,'%s','%s');\r\n";
    private final String insertDealerAccountBaseInfoTemplateSql = "insert into dealer_account_base_info (account_id, account_name,photo_url, summary, mobile,create_userid, create_username, update_userid,update_username, sex,last_update_time) " +
            "values (%s, '%s', '%s', '%s','%s','%s','%s','%s','%s',%s,'%s');\r\n";
    private final String accountIdAndPasswordTemplate = ",\"%s,%s\"\r\n";


    @Autowired
    public ReceiveOfDealerAccountInfo() {
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
        ClassPathResource classPathResourceOfDealerAccountInfo = new ClassPathResource(this.DEALER_ACCOUNT_INFO);
        InputStream inputStreamOfDealerAccountInfo = classPathResourceOfDealerAccountInfo.getInputStream();
        BufferedReader readerOfDealerAccountInfo = new BufferedReader(new InputStreamReader(inputStreamOfDealerAccountInfo, "UTF-8"));

        Integer iCount = 0;
        String strDealerInfoTmp;
        String myTime = super.getMyCalenderStr();
        while ((strDealerInfoTmp = readerOfDealerAccountInfo.readLine()) != null) {
            if (StringUtils.isNotBlank(strDealerInfoTmp)) {
                if (!strDealerInfoTmp.startsWith("#")) {
                    iCount++;
                    String[] arrAccountItems = strDealerInfoTmp.split(",", -1);
                    DealerAccount dealerAccount = this.buildDealerAccount(arrAccountItems, myTime);
                    String mobile = dealerAccount.getMobile();
                    if (StringUtils.isBlank(mobile)) {
                        log.info(String.format("账号信息手机号为空,账号ID:%s", dealerAccount.getAccountId()));
                        log.info(String.format("处理账号数据记录数量:%s", iCount));
                        continue;
                    }
                    String accountPassword = dealerAccount.getAccountPassword();
                    if (StringUtils.isBlank(accountPassword)) {
                        log.info(String.format("账号信息密码为空,账号ID:%s", dealerAccount.getAccountId()));
                        log.info(String.format("处理账号数据记录数量:%s", iCount));
                        continue;
                    }
                    Stream<DealerAccount> dealerAccountStream = this.lstDealerAccount.stream().filter(v -> StringUtils.isNotBlank(v.getMobile()) && mobile.equals(v.getMobile()));
                    Long rs = dealerAccountStream.count();
                    if (rs <= 0) {
                        this.lstDealerAccount.add(dealerAccount);
                    } else{
                        log.info(String.format("账号信息重复,账号ID:%s", dealerAccount.getAccountId()));
                    }
                    log.info(String.format("处理账号数据记录数量:%s", iCount));
                }
            }
        }
        readerOfDealerAccountInfo.close();
    }

    @Override
    public String process() {
        StringBuilder sbSql = new StringBuilder();
        sbSql.append("-- 输出账号信息sql脚本......\r\n");
        for (DealerAccount item : this.lstDealerAccount) {
            sbSql.append(String.format(this.insertDealerAccountTemplateSql, item.getChannel(), item.getAccountId(), item.getAccountName(), item.getDealerId()
                    , item.getDealerName(), item.getAccountLoginName(), item.getAccountStatus(), item.getAccountCreateTime(), item.getAccountUpdateTime()));
            sbSql.append(String.format(this.insertDealerAccountBaseInfoTemplateSql, item.getAccountId(), item.getAccountName(), item.getPhotoUrl()
                    , item.getSummary(), item.getMobile(), item.getCreateUserid(), item.getCreateUsername(), item.getUpdateUserid(), item.getUpdateUsername(), item.getSex(),
                    item.getLastUpdateTime()));
        }
        String mySql = sbSql.toString();
        return mySql;
    }

    @Override
    public String process1() {
        StringBuilder sbSql = new StringBuilder();
        for (DealerAccount item : this.lstDealerAccount) {
            sbSql.append(String.format(this.accountIdAndPasswordTemplate, item.getAccountId(), item.getAccountPassword()));
        }
        String mySql = sbSql.toString();
        String substring = mySql.substring(1);
        StringBuilder rs = new StringBuilder();
        rs.append("{\r\n\"unids\":[\r\n");
        rs.append(substring);
        rs.append(" ],\r\n\"sleepTime\":10,\r\n\"frequency\":1\r\n}");
        return rs.toString();
    }

    /**
     * 构建 DealerAccount
     *
     * @param arrAccountItems
     * @param myTime          初始化时间
     * @return
     */
    private DealerAccount buildDealerAccount(String[] arrAccountItems, String myTime) {
        DealerAccount dealerAccount = new DealerAccount();
        if (StringUtils.isNotBlank(arrAccountItems[0])) {
            dealerAccount.setAccountId(Integer.parseInt(String.valueOf(arrAccountItems[0])));
        }

        if (StringUtils.isNotBlank(arrAccountItems[1])) {
            dealerAccount.setDealerId(Integer.parseInt(String.valueOf(arrAccountItems[1])));
        }

        if (StringUtils.isNotBlank(arrAccountItems[2]) && !ProjConstants.STR_NULL.equals(arrAccountItems[2])) {
            dealerAccount.setPhotoUrl(arrAccountItems[2]);
        }

        Integer sex = 1;
        if (StringUtils.isNotBlank(arrAccountItems[5])) {
            Integer s = Integer.parseInt(String.valueOf(arrAccountItems[5]));
            if (s.equals(0)) {
                sex = 2;
            }
        }
        dealerAccount.setSex(sex);

        Integer channel = 1;
        if (StringUtils.isNotBlank(arrAccountItems[6])) {
            Integer s = Integer.parseInt(String.valueOf(arrAccountItems[6]));
            if (s.equals(1)) {
                channel = 5;
            }
        }
        dealerAccount.setChannel(channel);

        if (StringUtils.isNotBlank(arrAccountItems[7]) && !ProjConstants.STR_NULL.equals(arrAccountItems[7])) {
            dealerAccount.setAccountName(arrAccountItems[7].replace("'", ""));
        }

        if (StringUtils.isNotBlank(arrAccountItems[9]) && !ProjConstants.STR_NULL.equals(arrAccountItems[9])) {
            dealerAccount.setDealerName(arrAccountItems[9].replace("'", ""));
        }

        if (StringUtils.isNotBlank(arrAccountItems[10]) && !ProjConstants.STR_NULL.equals(arrAccountItems[10])) {
            dealerAccount.setAccountPassword(arrAccountItems[10]);
        }

        if (StringUtils.isNotBlank(arrAccountItems[11]) && !ProjConstants.STR_NULL.equals(arrAccountItems[11])) {
            dealerAccount.setMobile(arrAccountItems[11].replace("'", ""));
            dealerAccount.setAccountLoginName(arrAccountItems[11].replace("'", ""));
        }

        dealerAccount.setAccountStatus(ProjConstants.Dealer_Account_Status);
        dealerAccount.setAccountCreateTime(myTime);
        dealerAccount.setAccountUpdateTime(myTime);
        dealerAccount.setLastUpdateTime(myTime);
        dealerAccount.setCreateUserid(ProjConstants.OpereaterId);
        dealerAccount.setCreateUsername(ProjConstants.OpereaterName);
        dealerAccount.setUpdateUserid(ProjConstants.OpereaterId);
        dealerAccount.setUpdateUsername(ProjConstants.OpereaterName);
        dealerAccount.setSummary("批量导入");
        return dealerAccount;
    }

}
