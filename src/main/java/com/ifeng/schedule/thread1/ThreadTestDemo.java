package com.ifeng.schedule.thread1;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by sheng on 2015/9/24.
 */
public class ThreadTestDemo extends Thread {
    @Override
    public void run() {
        System.out.println("test run:" + Thread.currentThread().getName());
    }
}
