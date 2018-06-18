package com.mjz.entities;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 *  书<br>
 *
 * @author zhaob
 * @create 2018/6/18
 */
@Getter
@Setter
public class Book {

    private String id;

    private String name;

    private BigDecimal price;
}
