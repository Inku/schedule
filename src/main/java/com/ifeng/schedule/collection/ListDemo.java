package com.ifeng.schedule.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/19.
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ac");
        list.add("ab");
        list.add("abc");
        list.add("adc");
        list.add("acb");

        Collections.sort(list);
        System.out.println(list);
    }
}
