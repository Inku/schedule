package com.ifeng.schedule.single;

/**
 * Created by Inku on 2015/3/5.
 */
public class Single {

    private static Single s = new Single();

    private Single() {
    }

    public static Single getInstance() {
        return s;
    }
}