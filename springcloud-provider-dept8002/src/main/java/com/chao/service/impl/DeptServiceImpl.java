package com.chao.service.impl;

import com.chao.mapper.DeptMapper;
import com.chao.pojo.Dept;
import com.chao.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept queryId(Long deptno) {
        return deptMapper.queryId(deptno);
    }

    @Override
    public List<Dept> allDept() {
        return deptMapper.allDept();
    }
}
