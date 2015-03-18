package com.ifeng.schedule.thread;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/13.
 */
public class DrawThread extends Thread {
    private Account account;
    private double drawAmount;

    public DrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        draw();
    }

    public synchronized void draw(){
        if (account.getBalance() >= drawAmount) {
            System.out.println(getName() + "-->" + drawAmount);
            account.setBalance(account.getBalance() - drawAmount);
            System.out.println("余额为:" + account.getBalance());
        } else {
            System.out.println("余额不足");
        }
    }
}
