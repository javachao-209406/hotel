package com.chao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)   //链式写法
public class Dept implements Serializable {

    private Long deptno;
    private String dname;

    //这个数据存在那个数据库的字段   微服务，一个服务对应一个数据库
    private String db_source;
    private String username;
    private String password;
    /**
     * 链式写法
     *        Dept dept = new Dept();
     *        dept.setDepteno().setdName();
     */

}
