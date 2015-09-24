package com.ifeng.schedule.thread1;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by sheng on 2015/9/24.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        RunnableDemo demo = new RunnableDemo();

        Thread t1 = new Thread(demo);
        Thread t2 = new Thread(demo);
        Thread t3 = new Thread(demo);
        Thread t4 = new Thread(demo);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}