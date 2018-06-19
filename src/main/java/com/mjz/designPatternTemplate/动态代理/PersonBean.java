package com.mjz.designPatternTemplate.动态代理;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/19
 */
public class PersonBean implements Person{

    @Override
    public String getName(String str) {
        return "动态代理类"+str;
    }
}
