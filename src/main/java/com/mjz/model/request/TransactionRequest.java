package com.mjz.model.request;


import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

/**
 * 交易对象
 *
 * @author zhaob
 * @create 2018/5/26
 */
@Getter
@Setter
public class TransactionRequest {

    /** 用户编号*/
    private String userDisplayId;
    /** 用户姓名*/
    private String name;
    /** 交易类型*/
    private Integer type;
    /** 转出账户*/
    private int outAccountDisplayId;
    /** 转入账户*/
    private int inAccountDisplayId;
    /** 交易金额*/
    private BigDecimal amount;
    /** 备注*/
    private String comment;

}
