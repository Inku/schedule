package com.ifeng.schedule.thread;

/**
 * Created by zhengpeng on 15/3/11.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo("zhang3");
        Demo d2 = new Demo("li4");

        d1.start();
        d2.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("over....." + Thread.currentThread().getName());
        }
    }
}