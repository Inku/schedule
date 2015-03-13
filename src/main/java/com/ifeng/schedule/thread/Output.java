package com.ifeng.schedule.thread;

/**
 * Created by zhengpeng on 15/3/13.
 */
public class Output implements Runnable {
    Resource r;

    public Output(Resource r) {
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
