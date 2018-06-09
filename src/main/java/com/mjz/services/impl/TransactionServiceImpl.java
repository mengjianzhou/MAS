package com.mjz.services.impl;

import com.mjz.entities.AccountDO;
import com.mjz.entities.UserDO;
import com.mjz.mapper.AccountMapper;
import com.mjz.mapper.TransactionMapper;
import com.mjz.entities.TransactionDO;
import com.mjz.mapper.UserMapper;
import com.mjz.model.request.TransactionRequest;
import com.mjz.model.response.TransactionResponse;
import com.mjz.services.TransactionService;
import com.mjz.utils.DateTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/5/26
 */
@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionMapper transactionMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void addTransaction(TransactionRequest transRequest) {
        TransactionDO transactionDO = getTransactionDO(transRequest);
        transactionMapper.addTransaction(transactionDO);
    }

    @Override
    public void delTrans(Integer id) {
        transactionMapper.delTransaction(id);
    }

    @Override
    public List<TransactionResponse> queryAllTrans() {
        List<TransactionDO> transactionDOList =  transactionMapper.queryAllTransaction();
        List<TransactionResponse> transactionVoList = getTransactionList(transactionDOList);
        return transactionVoList;
    }

    private List<TransactionResponse> getTransactionList(List<TransactionDO> transactionDOList) {
        List<TransactionResponse> resultList = new ArrayList();
        for(TransactionDO transactionDO : transactionDOList){
            TransactionResponse transResp = new TransactionResponse();
            transResp.setName(transactionDO.getName());
            transResp.setAmount(transactionDO.getAmount());
            transResp.setType(transactionDO.getType());
            transResp.setComment(transactionDO.getComment());
            transResp.setCreatedTime(transactionDO.getCreatedTime());
            resultList.add(transResp);
        }
        return resultList;
    }

    private TransactionDO getTransactionDO(TransactionRequest transactionVo) {
        TransactionDO transactionDO = new TransactionDO();
        UserDO userDO = userMapper.queryUserByDisplayId(transactionVo.getUserDisplayId());
        transactionDO.setUserId(userDO.getId());
        transactionDO.setType(transactionVo.getType());
        transactionDO.setName(transactionVo.getName());
        AccountDO outAccount = accountMapper.queryByDisplayId(transactionVo.getOutAccountDisplayId());
        transactionDO.setOutAccountId(outAccount.getId());
        AccountDO inAccount = accountMapper.queryByDisplayId(transactionVo.getInAccountDisplayId());
        transactionDO.setInAccountId(inAccount.getId());
        transactionDO.setAmount(transactionVo.getAmount());
        transactionDO.setComment(transactionVo.getComment());
        transactionDO.setCreatedTime(DateTools.getCurrentDateTime());
        return transactionDO;
    }
}
