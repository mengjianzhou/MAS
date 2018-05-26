package com.mjz.services.impl;

import com.mjz.mapper.TransactionMapper;
import com.mjz.entities.TransactionDO;
import com.mjz.model.TransactionVo;
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

    @Override
    public void addTransaction(TransactionVo transactionVo) {
        TransactionDO transactionDO = getTransactionDO(transactionVo);
        transactionMapper.addTransaction(transactionDO);
    }

    @Override
    public void delTrans(Integer id) {
        transactionMapper.delTransaction(id);
    }

    @Override
    public List<TransactionVo> queryAllTrans() {
        List<TransactionDO> transactionDOList =  transactionMapper.queryAllTransaction();
        List<TransactionVo> transactionVoList = getTransactionVoList(transactionDOList);
        return transactionVoList;
    }

    private List<TransactionVo> getTransactionVoList(List<TransactionDO> transactionDOList) {
        List<TransactionVo> resultList = new ArrayList();
        for(TransactionDO transactionDO : transactionDOList){
            TransactionVo vo = new TransactionVo();
            vo.setId(transactionDO.getId());
            vo.setName(transactionDO.getName());
            vo.setAmount(transactionDO.getAmount());
            vo.setType(transactionDO.getType());
            vo.setComment(transactionDO.getComment());
            vo.setCreateTime(transactionDO.getCreatedTime());
            resultList.add(vo);
        }

        return resultList;
    }

    private TransactionDO getTransactionDO(TransactionVo transactionVo) {
        TransactionDO transactionDO = new TransactionDO();
        transactionDO.setUserId("U201805261");
        transactionDO.setType(transactionVo.getType());
        transactionDO.setName(transactionVo.getName());
        transactionDO.setAmount(transactionVo.getAmount());
        transactionDO.setComment(transactionVo.getComment());
        transactionDO.setCreatedTime(DateTools.getCurrentDateTime());
        return transactionDO;
    }
}
