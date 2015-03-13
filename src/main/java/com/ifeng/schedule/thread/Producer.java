package com.ifeng.schedule.thread;

/**
 * Created by zhengpeng on 15/3/13.
 */
public class Producer implements Runnable {
    private Resource r;

    public Producer(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.set("烤鸭");
        }
    }
}
