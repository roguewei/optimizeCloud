package com.winston.cloud.service;

import com.winston.cloud.result.Result;

public interface IConsumerService {

    public Result getDept();

    public Result getDept(Long id);

}
