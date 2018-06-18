package com.mjz.entities;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/18
 */
@Getter
@Setter
public class Acct {

    private String id;
    private String name;
    private BigDecimal amount;
}
