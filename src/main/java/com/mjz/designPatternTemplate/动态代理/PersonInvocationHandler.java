package com.mjz.designPatternTemplate.动态代理;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/19
 */
public class PersonInvocationHandler implements InvocationHandler {

    private Logger logger = LoggerFactory.getLogger(PersonInvocationHandler.class);
    private Person target;

    public PersonInvocationHandler(Person personBean){
        this.target = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logger.info("动态代理开始");
        logger.info("method="+method);
        method.invoke(target, args);
        logger.info("动态代理测试结束");
        return null;
    }
}
