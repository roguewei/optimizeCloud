package com.winston.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Winston
 * @title: DiscoveryController
 * @projectName springcloud
 * @description: 服务发现
 * @date 2019/6/13 9:29
 */
@RestController
@RequestMapping("/discovery")
public class DiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        System.out.println("----------"+services);

        List<ServiceInstance> instances = discoveryClient.getInstances("OPTIMIZECLOUD-CONFIG-PROVIDER-CLIENT");
        for(ServiceInstance element : instances){
            System.out.println(element.getServiceId()+"-----"+element.getHost()+"------"+element.getUri());
        }
        return this.discoveryClient;
    }

}
