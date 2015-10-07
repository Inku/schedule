package com.ifeng.schedule.factory;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/10/7.
 */
public class Printer implements Output {
    private String msg = "";

    @Override
    public void getData(String msg) {
        this.msg += msg;
    }

    @Override
    public void print() {
        System.out.println(msg);
        msg = "";
    }
}
