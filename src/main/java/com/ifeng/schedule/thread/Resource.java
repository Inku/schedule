package com.ifeng.schedule.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/13.
 */
public class Resource {
    private String name;
    private int count = 1;
    private boolean flag = false;
    private Lock lock = new ReentrantLock();
    private Condition in = lock.newCondition();
    private Condition out = lock.newCondition();

    public void set(String name) {
        lock.lock();
        try {
            while (flag) {
                in.await();
            }
            this.name = name + count;
            count++;
            System.out.println(Thread.currentThread().getName() + "-->生产者-->" + this.name);
            flag = true;
            out.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void out() {
        lock.lock();
        try {
            while (!flag) {
                out.await();
            }
            System.out.println(Thread.currentThread().getName() + "-->消费者----->" + this.name);
            flag = false;
            in.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
