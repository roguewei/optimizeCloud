package com.winston.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Winston
 * @title: MyRule
 * @projectName springcloud
 * @description:
 * @date 2019/6/13 9:47
 */
@Configuration
public class MyRuleConfig {


    @Bean
    public IRule myRule() {
        return new RandomRule_New();
    }

}
