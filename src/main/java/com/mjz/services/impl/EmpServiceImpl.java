package com.mjz.services.impl;

import com.mjz.entities.Emp;
import com.mjz.mapper.EmpMapper;
import com.mjz.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/17
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    @Cacheable(cacheNames = "emp")
    public void add(String id, String name) {
        Emp emp = new Emp();
        emp.setId(id);
        emp.setName(name);
        empMapper.addEmp(emp);
        redisTemplate.opsForValue().set(id,name);
    }

    @Override
    public List<Emp> queryEmps() {
        return empMapper.queryEmps();
    }

    @Override
    public void updateEmp(String id, String name) {
        Emp emp = new Emp();
        emp.setId(id);
        emp.setName(name);
        empMapper.updateEmp(emp);
    }

    @Override
    public void deleteEmp(String id) {
        empMapper.deleteEmp(id);
    }

    @Override
    public Emp queryEmp(String id) {
        return empMapper.queryEmp(id);
    }
}
