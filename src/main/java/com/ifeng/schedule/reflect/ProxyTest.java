package com.ifeng.schedule.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/22.
 */
public class ProxyTest {
    public static void main(String[] args) {

        InvocationHandler handler = new MyInvokationHandler();
        Person p = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, handler);
        p.walk();
        p.sayHello("sunwukong");
    }
}
