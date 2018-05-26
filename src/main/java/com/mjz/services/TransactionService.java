package com.mjz.services;


import com.mjz.entities.TransactionDO;
import com.mjz.model.TransactionVo;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/5/26
 */
public interface TransactionService {


    void addTransaction(TransactionVo transactionVo);

    void delTrans(Integer id);

    List<TransactionVo> queryAllTrans();
}
