package com.ifeng.schedule.thread;

import java.util.concurrent.Callable;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/13.
 */
public class CallableDemo implements Callable {
    public Integer call() {
        int i = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
        return i;
    }
}
