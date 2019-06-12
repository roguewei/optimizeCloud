package com.winston.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Winston
 * @title: Consume_App_80
 * @projectName springcloud
 * @description:
 * @date 2019/6/12 17:15
 */
@SpringBootApplication
@EnableEurekaClient
public class Consume_App_80 {

    public static void main(String[] args) {
        SpringApplication.run(Consume_App_80.class, args);
    }

}
