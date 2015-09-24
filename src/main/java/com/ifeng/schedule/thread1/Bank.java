package com.ifeng.schedule.thread1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by sheng on 2015/9/24.
 */
public class Bank {
    private int sum;
    private Lock lock = new ReentrantLock();

    public void add(int num) {
        lock.lock();
        sum += num;
        System.out.println("sum=" + sum + ":" + Thread.currentThread().getName());
        lock.unlock();
    }
}
