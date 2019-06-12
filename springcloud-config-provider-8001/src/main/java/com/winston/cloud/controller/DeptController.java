package com.winston.cloud.controller;

import com.winston.cloud.entities.Dept;
import com.winston.cloud.result.Result;
import com.winston.cloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Winston
 * @title: DeptController
 * @projectName springcloud
 * @description:
 * @date 2019/6/12 14:56
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @GetMapping
    public Result getDept(){
        List<Dept> dept = deptService.getDept();
        return Result.success(dept);
    }

    @GetMapping("/{id}")
    public Result getDept(@PathVariable("id") Long id){
        Dept dept = deptService.getDept(id);
        return Result.success(dept);
    }

}
