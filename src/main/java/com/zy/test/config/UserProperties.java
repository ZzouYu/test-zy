package com.zy.test.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: zy
 * @date: 2020/9/25 下午3:28
 * @description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "zy")
public class UserProperties {
    private String name;

    private Integer age;

    private String handBoy;

}

