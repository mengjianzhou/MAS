package com.mjz.model.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 账户请求对象封装类
 *
 * @author zhaob
 * @create 2018/6/9
 */
@Getter
@Setter
@ToString
public class AccountRequest {
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

}
