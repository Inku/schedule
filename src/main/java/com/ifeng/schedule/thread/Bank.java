package com.ifeng.schedule.thread;

/**
 * Created by zhengpeng on 15/3/12.
 */
public class Bank {
    private int sum;

    public synchronized void add(int num) {
        sum += num;
        System.out.println("sum=" + sum + "->" + Thread.currentThread().getName());
    }
}
