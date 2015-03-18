package com.ifeng.schedule.thread;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/13.
 */
public class Consumer implements Runnable {
    private Resource r;

    public Consumer(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.out();
        }
    }
}
