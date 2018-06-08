package com.mjz.mapper;

import com.mjz.entities.AccountDO;

/**
 * 账户数据库访问类
 *
 * @author zhaob
 * @create 2018/6/9
 */
public interface AccountMapper {

    void addAccount(AccountDO accountDO);

    void delAccount(String accountDisplayId);



}
