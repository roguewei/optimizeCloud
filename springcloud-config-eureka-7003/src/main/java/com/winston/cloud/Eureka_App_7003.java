package com.winston.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Winston
 * @title: Eureka_App_7001
 * @projectName springcloud
 * @description:
 * @date 2019/6/12 11:48
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka_App_7003 {

    public static void main(String[] args) {
        SpringApplication.run(Eureka_App_7003.class, args);
    }

}
