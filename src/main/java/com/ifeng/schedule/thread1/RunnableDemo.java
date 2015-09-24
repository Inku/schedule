package com.ifeng.schedule.thread1;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by sheng on 2015/9/24.
 */
public class RunnableDemo implements Runnable {
    private int num = 100;

    @Override
    public void run() {
        print();
    }

    private void print() {
        while (true) {
            synchronized (this) {
                if (num > 0) {
                    //Thread.sleep(1);
                    System.out.println(num + ":run--" + Thread.currentThread().getName());
                } else {
                    break;
                }
                num--;
            }
        }
    }
}
