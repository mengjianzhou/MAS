package com.mjz.services;


import com.mjz.model.request.TransactionRequest;
import com.mjz.model.response.TransactionResponse;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/5/26
 */
public interface TransactionService {


    void addTransaction(TransactionRequest transactionVo);

    void delTrans(Integer id);

    List<TransactionResponse> queryAllTrans();
}
