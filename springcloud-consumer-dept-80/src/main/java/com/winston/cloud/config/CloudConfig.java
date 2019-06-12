package com.winston.cloud.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Winston
 * @title: cloudConfig
 * @projectName springcloud
 * @description:
 * @date 2019/6/12 17:21
 */
@Component
@ConfigurationProperties(prefix = "wintons.url")
@Data
public class CloudConfig {

    private String peoviderurl;

}
