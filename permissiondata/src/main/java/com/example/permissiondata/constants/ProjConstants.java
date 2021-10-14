package com.example.permissiondata.constants;

/**
 * 项目常量类
 */
public final class ProjConstants {
    private ProjConstants() {
    }

    /**
     * 会员vinCode验重，需要验重
     */
    public static final Integer Dealer_Vincode_check_Yes = 1;

    /**
     * 经销商状态
     */
    public static final Integer Dealer_Status = 0;

    /**
     * 账号状态
     */
    public static final Integer Dealer_Account_Status = 1;

    /**
     * 数据有效状态值
     */
    public static final Integer Is_Delete = 0;

    /**
     * 默认操作人名称
     */
    public static final String OpereaterName = "系统管理员";

    /**
     * 默认操作人id
     */
    public static final String OpereaterId = "admin";

    /**
     * 时间格式
     */
    public static final String TimeFormat = "yyyy-MM-dd HH:mm:ss";

    /**
     * excel中null
     */
    public static final String STR_NULL = "NULL";

    /**
     * 角色-账号关联关系
     */
    public static final String FILENAME_ROLE_ACCOUNT = "d:/huiyuanimport/permissiondata/my-role-account.txt";

    /**
     * 会员信息
     */
    public static final String FILENAME_DEALER_INFO = "d:/huiyuanimport/my-dealer-info.txt";

    /**
     * 账号信息
     */
    public static final String FILENAME_DEALER_ACCOUNT = "d:/huiyuanimport/my-dealer-account-info.txt";

    /**
     * 账号信息
     */
    public static final String FILENAME_ACCOUNTID_PASSWORD = "d:/huiyuanimport/my-accountid-password.txt";
}
