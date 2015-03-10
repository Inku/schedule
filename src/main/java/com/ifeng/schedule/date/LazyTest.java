package com.ifeng.schedule.date;

import java.util.Calendar;

/**
 * Created by Inku on 2015/3/10.
 */
public class LazyTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2003, 7, 31);
        cal.set(Calendar.MONTH, 8);
        System.out.println(cal.getTime());
        cal.set(Calendar.DATE, 5);
        System.out.println(cal.getTime());
    }
}
