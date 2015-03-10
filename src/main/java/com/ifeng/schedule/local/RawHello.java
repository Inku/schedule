package com.ifeng.schedule.local;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Inku on 2015/3/10.
 */
public class RawHello {
    public static void main(String[] args) {
        System.out.println("hello world");
        Locale myLocale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("mess", myLocale);
        System.out.println(bundle.getString("hello"));
    }
}
