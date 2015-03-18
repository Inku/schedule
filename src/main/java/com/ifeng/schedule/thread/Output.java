package com.ifeng.schedule.thread;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/13.
 */
public class Output implements Runnable {
    Resource1 r;

    public Output(Resource1 r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            try {
                r.out();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
