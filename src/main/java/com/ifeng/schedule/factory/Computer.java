package com.ifeng.schedule.factory;


/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/10/7.
 */
public class Computer {
    private Output output;

    public Computer(Output output) {
        this.output = output;
    }

    public void keyIn(String msg) {
        output.getData(msg);
    }

    public void print(){
        output.print();
    }
}
