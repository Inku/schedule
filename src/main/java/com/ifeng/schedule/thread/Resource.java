package com.ifeng.schedule.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhengpeng on 15/3/13.
 */
public class Resource {
    private String name;
    private int count = 1;
    private boolean flag = false;
    private Lock lock = new ReentrantLock();

    public void set(String name) {
        lock.lock();
        try {
            while (flag) {
                wait();
            }
            this.name = name + count;
            count++;
            System.out.println(Thread.currentThread().getName() + "-->生产者-->" + this.name);
            flag = true;
            notifyAll();
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
                wait();
            }
            System.out.println(Thread.currentThread().getName() + "-->消费者----->" + this.name);
            flag = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
