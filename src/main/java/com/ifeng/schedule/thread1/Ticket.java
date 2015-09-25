package com.ifeng.schedule.thread1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by sheng on 2015/9/24.
 */
public class Ticket {
    private int num = 100;
    private Lock lock = new ReentrantLock();

    public void saleTicket() {
        while (true) {
            lock.lock();
            if (num > 0) {
                System.out.println("num=" + num + ":" + Thread.currentThread().getName());
            } else {
                break;
            }
            num--;
            lock.unlock();
        }
    }
}
