package com.winston.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Winston
 * @title: Provider_App_8001
 * @projectName springcloud
 * @description:
 * @date 2019/6/12 14:55
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.winston.cloud.mapper", sqlSessionFactoryRef = "sqlSessionFactory")
public class Provider_App_8003 {

    public static void main(String[] args) {
        SpringApplication.run(Provider_App_8003.class, args);
    }

}
