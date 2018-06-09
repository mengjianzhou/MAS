package com.mjz.enums;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/9
 */
public enum TransactionType {

    WITHDRAW(1, "提现"),
    TRANSFER(2, "转账"),
    DEPOSIT(3, "存款"), ;

    private int code;
    private String desc;

    private TransactionType(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public TransactionType getTransactionTypeByCode(int code){
        TransactionType[] transactionTypes = TransactionType.values();
        for(TransactionType transactionType : transactionTypes){
            if(transactionType.code==code){
                return transactionType;
            }
        }
        return null;
    }

}
