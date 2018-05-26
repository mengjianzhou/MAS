package com.mjz.mapper;

import com.mjz.entities.TransactionDO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/5/26
 */
public interface TransactionMapper {

    @Select("select * from transaction")
    List<TransactionDO> queryAllTransaction();

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into transaction(user_id,type,name,amount,comment,created_time) " +
            "values(#{userId},#{type},#{name},#{amount},#{comment},#{createdTime})")
    void addTransaction(TransactionDO transactionDO);

    @Delete("delete from transaction where id=#{id}")
    void delTransaction(Integer id);

}
