package com.ifeng.schedule.thread;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/12.
 */
public class Cus implements Runnable {

    private Bank b = new Bank();

    @Override
    public void run() {
        for (int x = 0; x < 3; x++) {
            b.add(100);
        }
    }
}
