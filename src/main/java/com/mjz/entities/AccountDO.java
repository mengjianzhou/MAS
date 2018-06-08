package com.mjz.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 账户对应的数据库实体类
 *
 * @author zhaob
 * @create 2018/6/9
 */
@Getter
@Setter
@ToString
public class AccountDO {
    /**账户编号*/
    private Long id;
    /**账户对外显示ID*/
    private String accountDisplayId;
    /**用户显示ID*/
    private Long userId;
    /**账户名称*/
    private String accountName;
    /**账户可用金额*/
    private BigDecimal availableAmount;
    /**预入账金额*/
    private BigDecimal preIncomeAmount;
    /** 预转出金额*/
    private BigDecimal preOutcomeAmount;
    /** 账户状态*/
    private Boolean status;
    /**创建时间*/
    private String createdTime;
    /**最后修改时间*/
    private String lastUpdatedTime;
}
