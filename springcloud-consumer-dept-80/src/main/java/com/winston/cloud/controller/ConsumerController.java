package com.winston.cloud.controller;

import com.winston.cloud.config.CloudConfig;
import com.winston.cloud.entities.Dept;
import com.winston.cloud.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Winston
 * @title: ConsumerController
 * @projectName springcloud
 * @description:
 * @date 2019/6/12 17:19
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private CloudConfig cloudConfig;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public Result getDept(){
        return restTemplate.getForObject(cloudConfig.getPeoviderurl()+"/dept", Result.class);
    }

    @GetMapping("/{id}")
    public Result getDept(@PathVariable("id") Long id){
        return restTemplate.getForObject(cloudConfig.getPeoviderurl()+"/dept/"+id, Result.class);
    }

}
