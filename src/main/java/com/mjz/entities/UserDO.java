package com.mjz.entities;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户数据库实体类
 *
 * @author zhaob
 * @create 2018/5/26
 */
@Getter
@Setter
public class UserDO {
    private Long id;
    private String displayId;
    private String mobile;
    private String nickName;
    private String name;
    private String password;
    private Boolean enable;
    private String createdTime;

}
