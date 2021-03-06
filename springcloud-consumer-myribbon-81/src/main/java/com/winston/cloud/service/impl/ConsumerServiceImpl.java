package com.winston.cloud.service.impl;

import com.winston.cloud.result.Result;
import com.winston.cloud.service.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Winston
 * @title: ConsumerServiceImpl
 * @projectName springcloud
 * @description:
 * @date 2019/6/13 9:15
 */
@Service
public class ConsumerServiceImpl implements IConsumerService {

    private static final String REST_URL= "http://OPTIMIZECLOUD-CONFIG-PROVIDER-CLIENT";

    @Autowired
    private RestTemplate restTemplate;

    public Result getDept() {
        return restTemplate.getForObject(REST_URL+"/dept", Result.class);
    }

    public Result getDept(Long id) {
        return restTemplate.getForObject(REST_URL+"/dept/"+id, Result.class);
    }
}
