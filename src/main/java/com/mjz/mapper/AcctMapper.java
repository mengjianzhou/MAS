package com.mjz.mapper;

import com.mjz.entities.Acct;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/18
 */

public interface AcctMapper {

    void updateAcct(Acct acct);

    Acct queryAcct(String id);
}
