package com.ifeng.schedule.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/13.
 */
public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableDemo cd = new CallableDemo();
        FutureTask<Integer> future = new FutureTask<Integer>(cd);
        Thread t1 = new Thread(future);
        t1.start();
        System.out.println(future.get());
    }
}
