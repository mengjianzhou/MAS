package com.mjz.mapper;

import com.mjz.entities.UserDO;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/5/26
 */
public interface UserMapper {

    List<UserDO> queryAllUser();
}
