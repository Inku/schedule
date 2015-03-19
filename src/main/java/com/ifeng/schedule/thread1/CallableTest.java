package com.ifeng.schedule.thread1;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/15.
 */
class Process implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-->process Run:" + i);
        }
        return i;
    }
}

public class CallableTest {
    public static void main(String[] args) {
        Process p = new Process();
        FutureTask<Integer> ft = new FutureTask<>(p);
        Thread t1 = new Thread(ft);

        t1.start();
    }
}
