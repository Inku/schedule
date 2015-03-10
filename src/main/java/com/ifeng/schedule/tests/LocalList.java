package com.ifeng.schedule.tests;

import java.util.Locale;

/**
 * Created by Inku on 2015/3/10.
 */
public class LocalList {
    public static void main(String[] args) {
        Locale[] localeList = Locale.getAvailableLocales();
        for (int i = 0; i < localeList.length; i++) {
            System.out.println(localeList[i].getDisplayCountry() + "=" + localeList[i].getCountry());
        }
    }
}
