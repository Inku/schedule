package com.ifeng.schedule.other;

import java.util.*;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/15.
 */
public class SystemDemo {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        Properties properties = System.getProperties();
        Set<String> nameSet = properties.stringPropertyNames();
        for (String name : nameSet) {
            String value = properties.getProperty(name);
            System.out.println(name+"-->"+value);
        }
    }
}
