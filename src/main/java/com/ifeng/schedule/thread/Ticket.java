package com.ifeng.schedule.thread;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/12.
 */
public class Ticket implements Runnable {
    private int num = 200;

    Object obj = new Object();


    public void sale() {
        while (true) {
            synchronized (obj) {
                if (num > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + num--);
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public void run() {
        sale();
    }
}
