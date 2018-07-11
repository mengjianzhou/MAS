package com.mjz.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/5/26
 */
@Getter
@Setter
@Slf4j
public class TransactionDO {

    /**主键*/
    private Long id;
    /** 用户编号*/
    private Long userId;
    /** 用户姓名*/
    private String name;
    /** 交易类型*/
    private Integer type;
    /** 转出账户*/
    private long outAccountId;
    /** 转入账户*/
    private long inAccountId;
    /** 交易金额*/
    private BigDecimal amount;
    /** 备注*/
    private String comment;
    /** 创建时间*/
    private String createdTime;

}
