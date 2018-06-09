package com.mjz.model.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/9
 */
@Getter
@Setter
public class TransactionResponse {

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
    /** 交易时间*/
    private String createdTime;
}
