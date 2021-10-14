package com.taoche.example.redisdemo.service;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.taoche.example.redisdemo.constant.ProjConstant;
import com.taoche.example.redisdemo.dto.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import sun.java2d.pipe.SpanClipRenderer;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class RedisHelp {
    private final Gson GSON = new Gson();

    @Autowired
    @Qualifier(value = "userRedisTemplate")
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private RedisTemplate<String, Object> defaultRedisTemplate;

    /**
     * @param userInfo
     */
    public void addUserInfo(UserInfo userInfo, Boolean primary) {
        try {
            String key = String.format("%s:%s", ProjConstant.REDIS_KEY_USERINFO_FORMAT, userInfo.getId());
            if (primary) {
                this.defaultRedisTemplate.opsForValue().set(key, JSON.toJSONString(userInfo), ProjConstant.REDIS_KEY_USERINFO_EXPIRE_SECONDS, TimeUnit.SECONDS);
            } else {
                this.redisTemplate.opsForValue().set(key, JSON.toJSONString(userInfo), ProjConstant.REDIS_KEY_USERINFO_EXPIRE_SECONDS, TimeUnit.SECONDS);
            }
        } catch (Exception ex) {
            log.info("addUserInfo异常", ex);
        }
    }

    /**
     * @param id
     * @return
     */
    public UserInfo getUserInfo(String id, Boolean primary) {
        try {
            String key = String.format("%s:%s", ProjConstant.REDIS_KEY_USERINFO_FORMAT, id);
            Object obj = null;
            if (primary) {
                obj = this.defaultRedisTemplate.opsForValue().get(key);
            } else {
                obj = this.redisTemplate.opsForValue().get(key);
            }
            String jsonValue = String.valueOf(obj);
            UserInfo userInfo = JSON.parseObject(String.valueOf(obj), UserInfo.class);
            return userInfo;
        } catch (Exception ex) {
            log.info("getUserInfo异常", ex);
        }

        return null;
    }
}
