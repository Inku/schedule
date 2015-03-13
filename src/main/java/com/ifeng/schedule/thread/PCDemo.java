package com.ifeng.schedule.thread;

/**
 * Created by zhengpeng on 15/3/13.
 */
public class PCDemo {
    public static void main(String[] args) {
        Resource r=new Resource();
        Producer p = new Producer(r);
        Consumer c = new Consumer(r);

        Thread t0 = new Thread(p);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
