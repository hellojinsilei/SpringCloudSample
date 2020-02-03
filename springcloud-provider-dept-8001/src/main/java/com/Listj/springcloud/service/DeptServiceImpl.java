package com.Listj.springcloud.service;

import com.Listj.springcloud.dao.DeptDao;
import com.Listj.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
