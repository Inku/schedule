package com.ifeng.schedule.string;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/10.
 */
public class StringConstructorDemo {
    public static void main(String[] args) {
        stringConstructorDemo();
    }

    private static void stringConstructorDemo() {
        String s = new String();
        byte[] arr = {65, 66, 67, 68};
        String s1 = new String(arr);
        System.out.println(s1);
    }
}
