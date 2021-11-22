package com.taoche.example.redisdemo;

import com.taoche.example.redisdemo.dto.UserInfo;
import com.taoche.example.redisdemo.service.RedisHelp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class RedisdemoApplication implements CommandLineRunner {

    @Autowired
    private RedisHelp redisHelp;

    public static void main(String[] args) {
        SpringApplication.run(RedisdemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sfr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String myDateTime = sfr.format(new Date());
        String uuid = UUID.randomUUID().toString();
        //UserInfo dfliu = UserInfo.builder().id(uuid).userName("dfliu").age(40).remark(String.format("save_time:%s", myDateTime)).build();
        UserInfo dfliu = new UserInfo();
        dfliu.setId(uuid);
        dfliu.setUserName("dfliu");
        dfliu.setAge(40);
        dfliu.setRemark(String.format("save_time:%s", myDateTime));
        this.redisHelp.addUserInfo(dfliu, Boolean.TRUE);
        UserInfo userInfo = this.redisHelp.getUserInfo(uuid, Boolean.TRUE);

        Integer iCount = 8;
        String str0 = String.format("%02d",iCount);

        String str1 = "";
    }
}
