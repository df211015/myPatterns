package com.taoche.example.redisdemo.constant;

/**
 * 常量类
 */
public final class ProjConstant {
    private ProjConstant() {
    }

    /**
     * redis缓存,用户key
     */
    public static final String REDIS_KEY_USERINFO_FORMAT = "userinfo";

    /**
     * redis缓存,用户key,过期时间
     */
    public static final Long REDIS_KEY_USERINFO_EXPIRE_SECONDS = 60L;
}
