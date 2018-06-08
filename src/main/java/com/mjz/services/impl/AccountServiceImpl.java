package com.mjz.services.impl;

import com.mjz.entities.AccountDO;
import com.mjz.model.request.AccountRequest;
import com.mjz.services.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/9
 */
@Service
public class AccountServiceImpl implements AccountService {


    @Override
    public void addAccount(AccountRequest accountRequest) {

    }

    @Override
    public void delAccount(String accountDisplayId) {

    }

    @Override
    public void updateAccount(AccountDO accountDO) {

    }

    @Override
    public AccountDO queryById(Long id) {
        return null;
    }

    @Override
    public AccountDO queryByDisplayId(String displayId) {
        return null;
    }

    @Override
    public List<AccountDO> queryAll() {
        return null;
    }

    @Override
    public List<AccountDO> queryList(AccountDO accountDO) {
        return null;
    }
}
