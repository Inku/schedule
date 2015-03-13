package com.ifeng.schedule.thread;

/**
 * Created by Inku on 2015/3/13.
 */
public class DrawTest {
    public static void main(String[] args) {
        Account acct = new Account("1234567", 1000);
        Thread t1 = new DrawThread("甲",acct,800);
        Thread t2 = new DrawThread("乙",acct,800);

        t1.start();
        t2.start();
    }
}
