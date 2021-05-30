package com.chao.mapper;

import com.chao.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept queryId(Long deptno);

    public List<Dept> allDept();
}
