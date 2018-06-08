package com.mjz.entities;

import lombok.Getter;
import lombok.Setter;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
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
