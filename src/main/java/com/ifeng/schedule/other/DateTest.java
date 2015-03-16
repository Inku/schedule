package com.ifeng.schedule.other;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Inku on 2015/3/16.
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        String date1 = "2012-3-17";
        String date2 = "2015-3-16";
        long num = compare(date1,date2);
        System.out.println(num);

        Calendar c = new GregorianCalendar();
        c.setTime(new Date());
        c.add(Calendar.DATE,-1);
        System.out.println(DateFormat.getDateTimeInstance().format(c.getTime()));

        test();
        test2();
    }

    public static void test() {
        Date date = new Date();
        String pattern = "yyyy---MM---dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String str = sdf.format(date);
        System.out.println(str);
    }

    public static void test2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy---MM---dd");
        Date date = sdf.parse("2015---3---16");
        System.out.println(date);
    }

    public static long compare(String str1, String str2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(str1);
        Date date2 = sdf.parse(str2);

        Long time = Math.abs(date2.getTime()-date1.getTime());
        return time/1000/60/60/24;
    }
}
