package com.Listj.springcloud.service;

import com.Listj.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);
    Dept queryById(Long id);
    List<Dept> queryAll();
}
