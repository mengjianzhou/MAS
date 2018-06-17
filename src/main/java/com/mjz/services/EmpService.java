package com.mjz.services;

import com.mjz.entities.Emp;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/17
 */
public interface EmpService {

    void add(String id, String name);

    List<Emp> queryEmps();

    void updateEmp(String id, String name);

    void deleteEmp(String id);

    Emp queryEmp(String id);
}
