package com.ifeng.schedule.date;

import java.util.Date;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/10.
 */
public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(System.currentTimeMillis() + 100);

        System.out.println(d2);
        System.out.println(d2.compareTo(d1));
        System.out.println(d1.before(d2));
    }

}
