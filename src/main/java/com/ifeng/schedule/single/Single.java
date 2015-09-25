package com.ifeng.schedule.single;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/5.
 */
public class Single {

    private static final Single s = new Single();

    private Single() {
    }

    public static Single getInstance() {
        return s;
    }
}