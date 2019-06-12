package com.winston.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Winston
 * @title: ConfigBean
 * @projectName springcloud
 * @description:
 * @date 2019/6/12 17:18
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
