package com.winston.cloud.controller;

import com.winston.cloud.entities.Dept;
import com.winston.cloud.entities.DeptExample;
import com.winston.cloud.mapper.DeptMapper;
import com.winston.cloud.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Winston
 * @title: DeptController
 * @projectName springcloud
 * @description:
 * @date 2019/6/12 10:51
 */
@RestController
public class DeptController {

    @Autowired
    private DeptMapper deptMapper;

    @GetMapping("/dept")
    public Result getDept(){
        List<Dept> depts = deptMapper.selectByExample(new DeptExample());
        return Result.success(depts);
    }

}
