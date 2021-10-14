package com.example.permissiondata;

import com.example.permissiondata.constants.ProjConstants;
import com.example.permissiondata.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class PermissiondataApplication implements CommandLineRunner {
    @Autowired
    private MyCommand myCmdOfDataProcess;

    @Autowired
    private MyCommandExt myCmdOfDataProcessExt;


    public static void main(String[] args) {
        SpringApplication.run(PermissiondataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("启动成功,开始处理数据解析命令......");

        //生成账号-权限角色sql
        this.myCmdOfDataProcess.setMyReceiver(new ReceiveOfAccountRole());
        this.myCmdOfDataProcess.excute(ProjConstants.FILENAME_ROLE_ACCOUNT);

        //生成经销商数据sql
        this.myCmdOfDataProcess.setMyReceiver(new ReceiveOfDealerInfo());
        this.myCmdOfDataProcess.excute(ProjConstants.FILENAME_DEALER_INFO);

        //生成账号
        this.myCmdOfDataProcessExt.setMyReceiver(new ReceiveOfDealerAccountInfo());
        this.myCmdOfDataProcessExt.excute(ProjConstants.FILENAME_DEALER_ACCOUNT,ProjConstants.FILENAME_ACCOUNTID_PASSWORD);

    }
}