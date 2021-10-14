package com.taoche.example.redisdemo.config.config01;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring-boot-example
 * @description:
 * @author:
 * @create: 2018-05-16 15:15
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "spring.redis-user")
public class UserRedisProperties {
    private String host;
    private Integer port;
    private Long timeout;
    private String password;
    private Integer database = 0;
    private JedisConfigurationProperties jedis = new JedisConfigurationProperties();

    @Data
    public class JedisConfigurationProperties {
        private PoolConfigurationProperties pool = new PoolConfigurationProperties();

        @Data
        public class PoolConfigurationProperties {
            private Integer maxActive;
            private Long maxWait;
            private Integer maxIdle;
            private Integer minIdle;
        }
    }
}
