package com.ifeng.schedule.thread1;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by sheng on 2015/9/24.
 */
public class BankDemo {
    public static void main(String[] args) {
        Cus c = new Cus();

        new Thread(c::save).start();
        new Thread(c::save).start();

    }
}
