package com.ifeng.schedule.thread;

/**
 * Created by zhengpeng on 15/3/13.
 */
public class Test implements Runnable {
    private boolean flag;

    public Test(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (MyLock.locka) {
                System.out.println(Thread.currentThread().getName()+"-->if locka");
                synchronized (MyLock.lockb) {
                    System.out.println(Thread.currentThread().getName()+"-->if lockb");
                }
            }
        } else {
            synchronized (MyLock.lockb) {
                System.out.println(Thread.currentThread().getName()+"-->if lockb");
                synchronized (MyLock.locka) {
                    System.out.println(Thread.currentThread().getName()+"-->if locka");
                }
            }
        }
    }
}

class MyLock {
    public static final Object locka = new Object();
    public static final Object lockb = new Object();
}