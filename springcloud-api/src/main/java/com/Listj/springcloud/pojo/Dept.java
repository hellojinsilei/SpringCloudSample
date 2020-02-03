package com.Listj.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;
    private String dname;

    //数据存在那个数据库的字段
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
