package com.example.flyweightpattern.service.instance04;

import com.example.flyweightpattern.service.annotation.NotNull;
import com.example.flyweightpattern.service.annotation.UniquePackage;
import lombok.Data;

@Data
public class MyUserInfo {
    private Long id;
    private String name;
    private String remark;

    @NotNull(ignoreCondition = "saleApproachName==零售")
    @UniquePackage(unionField = "unifiedNumber")
    private String batchPackageName;
}