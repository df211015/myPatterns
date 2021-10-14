package com.example.permissiondata.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * dealer_account
 *
 * @author
 */
@Data
public class DealerAccount implements Serializable {

    /**
     * 自增主键
     */
    private Long id;

    /**
     * 创建渠道：枚举 1："车商端-PC", 2："车商端-APP",3："车商端-小程序",4："新OP运营后台",5："老OP运营后台"
     */
    private Integer channel;

    /**
     * 经销商账号id
     */
    private Integer accountId;

    /**
     * 账号名称
     */
    private String accountName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 经销商状态
     */
    private String accountStatusName;

    /**
     * 经销商id
     */
    private Integer dealerId;

    /**
     * 经销商名称
     */
    private String dealerName;

    /**
     * 经销商备注
     */
    private String summary;

    /**
     * 最后更新时间
     */
    private String lastUpdateTime;

    /**
     * 更新人名称
     */
    private String updateUsername;

    /**
     * 经销商所在城市ID
     */
    private Integer cityId;

    /**
     * 经销商所在城市名称
     */
    private String cityName;

    /**
     * 经销商账号id
     */
    private List<Integer> accountIds;

    /**
     * 排除经销商账号id
     */
    private List<Integer> excludeAccountIds;

    /**
     * 角色编码
     */
    private Set<String> roleCodes;

    /**
     * 角色名称
     */
    private Set<String> roleNames;

    /**
     * 经销商账号类型
     */
    private Integer accountType;

    /**
     * 经销商登录名称
     */
    private String accountLoginName;

    /**
     * 经销商登录密码
     */
    private String accountPassword;

    /**
     * 经销商登录密码
     */
    private String passwordBak;

    /**
     * 经销商状态
     */
    private Integer accountStatus;

    /**
     * 账号创建时间
     */
    private String accountCreateTime;

    /**
     * 账号更新时间
     */
    private String accountUpdateTime;

    /**
     * 手机验证码
     */
    private String code;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 账号等级
     */
    private Integer accountLevel;

    /**
     * 创建人id
     */
    private String createUserid;

    /**
     * 创建人名称
     */
    private String createUsername;

    /**
     * 更新人id
     */
    private String updateUserid;

    /**
     * 头像链接url
     */
    private String photoUrl;

    /**
     * 重置密码问题
     */
    private String accountQuestion;

    /**
     * 重置密码回答
     */
    private String accountAnswer;

    /**
     * 密码是否修改
     */
    private Integer isPasswordModified;

    /**
     * 是否首次登录
     */
    private Integer isFirsttimeLogin;

    /**
     * 显示名称
     */
    private String displayUsername;

    private String displayUserPicUrl;

    private Integer isDisplayShow;

    /**
     * email
     */
    private String email;

    /**
     * 职位
     */
    private String post;

    /**
     * 部门Id
     */
    private String departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 最近登录时间
     */
    private Date lastLoginTime;

    /**
     * 当前登录时间
     */
    private Date currentLoginTime;

    /**
     * 标题
     */
    private String title;

    private Integer isDpuser;

    /**
     * 是否锁定
     */
    private Integer isLock;

    /**
     * 锁定时间
     */
    private Date lockTime;

    /**
     * 手机号是否激活
     */
    private Integer isMobileActive;

    private static final long serialVersionUID = 1L;
}