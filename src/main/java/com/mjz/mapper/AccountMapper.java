package com.mjz.mapper;

import com.mjz.entities.AccountDO;

import java.util.List;

/**
 * 账户数据库访问类
 *
 * @author zhaob
 * @create 2018/6/9
 */
public interface AccountMapper {

    void addAccount(AccountDO accountDO);

    void delAccount(String accountDisplayId);

    void updateAccount(AccountDO accountDO);

    AccountDO queryById(Long id);

    AccountDO queryByDisplayId(String displayId);

    List<AccountDO> queryAllAccount();

    List<AccountDO> queryList(AccountDO accountDO);

}
