package com.mjz.model.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 账户返回类
 *
 * @author zhaob
 * @create 2018/6/9
 */
@Getter
@Setter
@ToString
public class AccountResponse {
    /**账户编号*/
    private String accountDisplayId;
    /**用户显示ID*/
    private String userDisplayId;
    /**账户名称*/
    private String accountName;
    /**账户可用金额*/
    private BigDecimal availableAmount;
    /**预入账金额*/
    private BigDecimal preIncomeAmount;
    /** 预转出金额*/
    private BigDecimal preOutcomeAmount;
    /**创建时间*/
    private String createdTime;
    /**最后修改时间*/
    private String lastUpdatedTime;
}
