package com.winston.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Winston
 * @title: CfgBean
 * @projectName springcloud
 * @description:
 * @date 2019/6/13 10:17
 */
@Configuration
public class CfgBean {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
