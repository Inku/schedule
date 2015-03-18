package com.ifeng.schedule.oo.interf;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/9.
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("mouse open");
    }

    @Override
    public void close() {
        System.out.println("mouse close");
    }
}
