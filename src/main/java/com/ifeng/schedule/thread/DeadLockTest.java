package com.ifeng.schedule.thread;

/**
 * Created by zhengpeng on 15/3/13.
 */
public class DeadLockTest {
    public static void main(String[] args) {
        Test a = new Test(true);
        Test b = new Test(false);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
}
