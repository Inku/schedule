package com.ifeng.schedule.thread;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/13.
 */
public class Resource1 {
    private String name;
    private String sex;
    private boolean flag = false;

    public synchronized void set(String name, String sex) throws InterruptedException {
        if (flag) {
            wait();
        }
        this.name = name;
        this.sex = sex;
        flag = true;
        notify();
    }

    public synchronized void out() throws InterruptedException {
        if (!flag) {
            wait();
        }
        System.out.println(name + "-->" + sex);
        flag = false;
        notify();
    }
}
