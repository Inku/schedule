package com.ifeng.schedule.inheritance;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/5.
 */
public class Worker extends Person {

    void work() {
        System.out.println(name+":"+age+"--worker work");
    }
}
