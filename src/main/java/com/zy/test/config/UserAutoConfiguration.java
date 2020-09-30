package com.zy.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zy
 * @date: 2020/9/28 下午2:30
 * @description:
 */
@Configuration
//@EnableConfigurationProperties({UserProperties.class})
public class UserAutoConfiguration {

    @Autowired
    UserProperties userProperties;

    @Bean
    public UserProperties user(UserProperties userProperties){
        System.out.println(userProperties);
        return userProperties;
    }
}
