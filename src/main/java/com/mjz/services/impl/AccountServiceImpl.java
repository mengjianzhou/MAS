package com.mjz.services.impl;

import com.mjz.entities.AccountDO;
import com.mjz.entities.UserDO;
import com.mjz.mapper.AccountMapper;
import com.mjz.mapper.UserMapper;
import com.mjz.model.request.AccountRequest;
import com.mjz.services.AccountService;
import com.mjz.utils.DateTools;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addAccount(AccountRequest accountRequest) {
        AccountDO accountDO = convert2DO(accountRequest);
        accountMapper.addAccount(accountDO);
    }

    private AccountDO convert2DO(AccountRequest accountRequest) {
        AccountDO accountDO = new AccountDO();
        accountDO.setAccountName(accountRequest.getAccountName());
        String accountDisplayId = generateAccountDisplayId();
        accountDO.setAccountDisplayId(accountDisplayId);
        accountDO.setAvailableAmount(accountRequest.getAvailableAmount());
        accountDO.setCreatedTime(DateTools.getCurrentDateTime());
        accountDO.setStatus(true);
        UserDO userDO = userMapper.queryUserByDisplayId(accountRequest.getUserDisplayId());
        accountDO.setUserId(userDO.getId());
        return accountDO;
    }

    private String generateAccountDisplayId() {
        return "A"+ DateTools.getCurrentTimestamp();
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
