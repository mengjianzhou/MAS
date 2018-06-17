package com.mjz.mapper;

import com.mjz.entities.Emp;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/17
 */
public interface EmpMapper {

    void addEmp(Emp emp);

    List<Emp> queryEmps();

    void updateEmp(Emp emp);

    void deleteEmp(String id);

    Emp queryEmp(String id);
}
