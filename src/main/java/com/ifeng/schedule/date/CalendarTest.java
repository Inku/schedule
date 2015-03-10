package com.ifeng.schedule.date;

import java.util.Calendar;

/**
 * Created by Inku on 2015/3/10.
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
    }
}
