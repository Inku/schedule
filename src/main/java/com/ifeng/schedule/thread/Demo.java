package com.ifeng.schedule.thread;

/**
 * Created by zhengpeng on 15/3/11.
 */
public class Demo extends Thread {
    private String name;

    public Demo(String name) {
        super(name);
        this.name = name;
    }

    public void run() {
        show();
    }

    public void show() {
        for (int x = 0; x < 10; x++) {
            System.out.println(name + "....x=" + x + "...." + currentThread().getName());
        }
    }
}
