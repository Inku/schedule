package com.ifeng.schedule.thread;

/**
 * Created by Inku on 2015/3/11.
 */
public class Demo1 implements Runnable {

    private String name;

    public Demo1(String name) {
        this.name = name;
        Thread.currentThread().setName(name);
    }

    public void run() {
        show();
    }

    public void show() {
        for (int x = 0; x < 10; x++) {
            System.out.println(name + "....x=" + x + "...." + Thread.currentThread().getName());
        }
    }


}
