package com.ifeng.schedule.thread;

/**
 * Created by zhengpeng on 15/3/13.
 */
public class ResourceDemo {
    public static void main(String[] args) {
        Resource r = new Resource();
        Input input = new Input(r);
        Output output = new Output(r);

        Thread inThread = new Thread(input);
        Thread outThread = new Thread(output);

        inThread.start();
        outThread.start();
    }
}
