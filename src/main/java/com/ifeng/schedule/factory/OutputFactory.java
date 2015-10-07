package com.ifeng.schedule.factory;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/10/7.
 */
public class OutputFactory {
    public Output getOutout(){
        return new Printer();
    }

    public static void main(String[] args) {
        OutputFactory of = new OutputFactory();
        Computer c = new Computer(of.getOutout());
        c.keyIn("msg1");
        c.keyIn("msg2");
        c.print();
    }
}
