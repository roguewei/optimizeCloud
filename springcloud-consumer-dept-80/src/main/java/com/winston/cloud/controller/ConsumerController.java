package com.winston.cloud.controller;

import com.winston.cloud.result.Result;
import com.winston.cloud.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private IConsumerService consumerService;

    @GetMapping
    public Result getDept(){
        return consumerService.getDept();
    }

    @GetMapping("/{id}")
    public Result getDept(@PathVariable("id") Long id){
        return consumerService.getDept(id);
    }

}
