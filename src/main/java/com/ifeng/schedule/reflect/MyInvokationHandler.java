package com.ifeng.schedule.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/22.
 */
interface Person {
    public void walk();

    public void sayHello(String name);
}

public class MyInvokationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("doing:" + method);
        if (args != null) {
            System.out.println("实参");
            for (Object val : args) {
                System.out.println(val);
            }
        } else {
            System.out.println("no shican");
        }
        return null;
    }
}
