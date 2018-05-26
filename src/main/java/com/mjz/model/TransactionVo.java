package com.mjz.model;


import lombok.Getter;
import lombok.Setter;
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
public class TransactionVo {

    private Long id;
    private String userDisplayId;
    private Integer type;
    private String name;
    private BigDecimal amount;
    private String comment;
    private String createTime;

}
