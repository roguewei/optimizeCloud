package com.winston.cloud;

import com.winston.myrule.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Winston
 * @title: Consume_App_80
 * @projectName springcloud
 * @description:
 * @date 2019/6/12 17:15
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RibbonClient(name = "OPTIMIZECLOUD-CONFIG-PROVIDER-CLIENT", configuration = MyRuleConfig.class)
public class Consume_App_81 {

    public static void main(String[] args) {
        SpringApplication.run(Consume_App_81.class, args);
    }

}
