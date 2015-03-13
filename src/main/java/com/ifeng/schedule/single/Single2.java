package com.ifeng.schedule.single;

/**
 * Created by Inku on 2015/3/5.
 */
public class Single2 {
    private static Single2 s = null;

    private Single2() {
    }

    public static Single2 getInstance() {
        if (s == null) {
            synchronized (Single2.class) {
                if (s == null) {
                    s = new Single2();
                }
            }
        }
        return s;
    }
}
