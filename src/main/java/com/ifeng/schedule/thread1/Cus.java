package com.ifeng.schedule.thread1;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by sheng on 2015/9/24.
 */
public class Cus {
    private Bank b = new Bank();

    public void save() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            b.add(100);
        }
    }
}
