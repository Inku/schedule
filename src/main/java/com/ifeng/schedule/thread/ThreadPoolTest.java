package com.ifeng.schedule.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/13.
 */
class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(6);
        pool.submit(new MyThread());
        pool.submit(new MyThread());
        pool.shutdown();

    }
}
