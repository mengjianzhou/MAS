package com.mjz.mapper;

import com.mjz.entities.UserDO;

import java.util.List;

/**
 * 用户数据库访问类
 *
 * @author zhaob
 * @create 2018/5/26
 */
public interface UserMapper {

    List<UserDO> queryAllUser();
}
