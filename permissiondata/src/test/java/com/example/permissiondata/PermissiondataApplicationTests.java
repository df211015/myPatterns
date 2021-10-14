package com.example.permissiondata;

import com.example.permissiondata.service.ReceiveOfDealerAccountInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PermissiondataApplicationTests {
    @Test
    void contextLoads() {
        String process = new ReceiveOfDealerAccountInfo().process();
        System.out.println(process);
    }

}
