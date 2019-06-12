package com.winston.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Winston
 * @title: Config_App_1001
 * @projectName springcloud
 * @description:
 * @date 2019/6/12 11:26
 */
@SpringBootApplication
@EnableConfigServer
public class Config_App_1001 {

    public static void main(String[] args) {
        SpringApplication.run(Config_App_1001.class, args);
    }

}
