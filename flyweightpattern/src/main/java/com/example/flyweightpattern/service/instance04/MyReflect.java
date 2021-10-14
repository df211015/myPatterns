package com.example.flyweightpattern.service.instance04;


import com.example.flyweightpattern.service.annotation.UniquePackage;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MyReflect {


    public void testReflesh(MyUserInfo myUserInfo) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Class<? extends MyUserInfo> aClass = myUserInfo.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Object obj = field.get(myUserInfo);
            //包校验
            UniquePackage uniquePackage = field.getAnnotation(UniquePackage.class);
            if (null != uniquePackage) {
                String cuprs = this.checkUniquePackageOnDB(myUserInfo, uniquePackage, field.getType(), obj);
                if (StringUtils.isNotBlank(cuprs)) {
                    System.out.println(String.format("错误:%s", cuprs));
                }
            }
        }
    }

    private String checkUniquePackageOnDB(MyUserInfo myUserInfo, UniquePackage uniquePackage, Class<?> type, Object obj) throws NoSuchFieldException, IllegalAccessException {
        if (!type.isAssignableFrom(String.class)) {
            return null;
        }
        if (null == obj) {
            return null;
        }
        if (StringUtils.isBlank(String.valueOf(obj))) {
            return null;
        }
        List<MyUserInfo> batchSalesVehicles = new ArrayList<>();

        String unionField = uniquePackage.unionField();
        if (StringUtils.isBlank(unionField)) {
            if (null != batchSalesVehicles && batchSalesVehicles.size() > 0) {
//                return MessageFormat.format("导入数据第{0}行，{1}：{2}在批售业务线中重复", analysisContext.readRowHolder().getRowIndex() + headRowNumber, excelProperty.value()[0], String.valueOf(obj));
                return String.format("错误:%s","重复");
            }
        } else {
            Class<? extends MyUserInfo> aClass = myUserInfo.getClass();
            Field declaredField = aClass.getDeclaredField(unionField);
            if (null == declaredField) {
                if (null != batchSalesVehicles && batchSalesVehicles.size() > 0) {
//                    return MessageFormat.format("导入数据第{0}行，{1}：{2}在批售业务线中重复", analysisContext.readRowHolder().getRowIndex() + headRowNumber, excelProperty.value()[0], String.valueOf(obj));
                    return String.format("错误:%s","重复");
                }
            }
            declaredField.setAccessible(true);
            Object v = declaredField.get(myUserInfo);
            if (null == v) {
                if (null != batchSalesVehicles && batchSalesVehicles.size() > 0) {
//                    return MessageFormat.format("导入数据第{0}行，{1}：{2}在批售业务线中重复", analysisContext.readRowHolder().getRowIndex() + headRowNumber, excelProperty.value()[0], String.valueOf(obj));
                    return String.format("错误:%s","重复");
                }
            } else {
                if (null == batchSalesVehicles || batchSalesVehicles.size() == 0) {
//                    return MessageFormat.format("导入数据第{0}行，{1}：{2}在批售业务线中不存在", analysisContext.readRowHolder().getRowIndex() + headRowNumber, excelProperty.value()[0], String.valueOf(obj));
                    return String.format("错误:%s","重复");
                }
            }
        }
        return null;
    }
}
