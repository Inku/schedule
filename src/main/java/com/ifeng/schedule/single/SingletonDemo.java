package com.ifeng.schedule.single;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/10/7.
 */
public class SingletonDemo {
    private static SingletonDemo singletonDemo = null;

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        if (singletonDemo == null) {
            singletonDemo = new SingletonDemo();
        }

        return singletonDemo;
    }
}
