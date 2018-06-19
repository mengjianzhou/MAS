package com.mjz.designPatternTemplate.动态代理;

import java.lang.reflect.Proxy;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/19
 */
public class MainTest {

    public static void main(String[] args) {
        PersonBean personBean = new PersonBean();

        Person p = getPersonBeanProxy(personBean);
        p.getName("hello world");
    }

    private static Person getPersonBeanProxy(Person person){
        Person personBean = (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new PersonInvocationHandler(person));
        return personBean;
    }

}
