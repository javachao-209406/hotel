package com.chao.service;

import com.chao.pojo.Dept;

import java.util.List;

public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryId(Long deptno);

    public List<Dept> allDept();
}
