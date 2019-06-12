package com.winston.cloud.service.impl;

import com.winston.cloud.entities.Dept;
import com.winston.cloud.entities.DeptExample;
import com.winston.cloud.mapper.DeptMapper;
import com.winston.cloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Winston
 * @title: DeptServiceImpl
 * @projectName springcloud
 * @description:
 * @date 2019/6/12 14:58
 */
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> getDept() {
        return deptMapper.selectByExample(new DeptExample());
    }

    public Dept getDept(Long id) {
//        DeptExample example = new DeptExample();
//        example.createCriteria().andDeptnoEqualTo(id);
        return deptMapper.selectByPrimaryKey(id);
    }
}
