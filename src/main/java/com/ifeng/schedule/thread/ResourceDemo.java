package com.ifeng.schedule.thread;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/13.
 */
public class ResourceDemo {
    public static void main(String[] args) {
        Resource1 r = new Resource1();
        Input input = new Input(r);
        Output output = new Output(r);

        Thread inThread = new Thread(input);
        Thread outThread = new Thread(output);

        inThread.start();
        outThread.start();
    }
}
