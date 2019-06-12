package com.winston.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Winston
 * @title: Provider_App_8001
 * @projectName springcloud
 * @description:
 * @date 2019/6/12 10:50
 */
@SpringBootApplication
@MapperScan(value = "com.winston.cloud.mapper", sqlSessionFactoryRef = "sqlSessionFactory")
public class Provider_App_8001 {

    public static void main(String[] args) {
        SpringApplication.run(Provider_App_8001.class, args);
    }

}
