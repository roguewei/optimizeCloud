package com.winston.cloud.service;

import com.winston.cloud.entities.Dept;

import java.util.List;

public interface IDeptService {

    List<Dept> getDept();

    Dept getDept(Long id);

}
