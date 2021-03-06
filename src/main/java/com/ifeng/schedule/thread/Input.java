package com.ifeng.schedule.thread;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/13.
 */
public class Input implements Runnable {
    Resource1 r;

    public Input(Resource1 r) {
        this.r = r;
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {
            try {
                if (x == 0) {
                    r.set("lilei", "M");
                } else {
                    r.set("韩梅梅", "女");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x = (x + 1) % 2;
        }
    }
}
