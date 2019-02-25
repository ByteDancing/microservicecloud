package com.union.service;

import com.union.entity.Dept;

import java.util.List;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2019/2/23 12:06
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(long id);

    public List<Dept> list();
}
