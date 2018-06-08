package com.mjz.services;

import com.mjz.entities.AccountDO;
import com.mjz.model.request.AccountRequest;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/9
 */
public interface AccountService {

    void addAccount(AccountRequest accountRequest);

    void delAccount(String accountDisplayId);

    void updateAccount(AccountDO accountDO);

    AccountDO queryById(Long id);

    AccountDO queryByDisplayId(String displayId);

    List<AccountDO> queryAll();

    List<AccountDO> queryList(AccountDO accountDO);
}
