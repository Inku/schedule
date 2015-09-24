package com.ifeng.schedule.thread1;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by sheng on 2015/9/24.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadTestDemo());
        t1.start();
    }
}