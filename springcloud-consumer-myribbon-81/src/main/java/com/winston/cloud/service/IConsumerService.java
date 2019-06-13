package com.winston.cloud.service;

import com.winston.cloud.result.Result;

/**
 * @author Winston
 * @title: ConsumerService
 * @projectName springcloud
 * @description:
 * @date 2019/6/13 10:06
 */
public interface IConsumerService {

    public Result getDept();

    public Result getDept(Long id);

}
