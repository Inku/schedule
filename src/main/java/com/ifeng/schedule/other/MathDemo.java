package com.ifeng.schedule.other;

import java.util.Random;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/16.
 */
public class MathDemo {
    public static void main(String[] args) {
        double d1 = Math.ceil(12.56);
        double d2 = Math.floor(12.56);
        double d3 = Math.round(12.56);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(Math.pow(3.5, 4.1));
        Random r = new Random();

        System.out.println(r.nextInt());
    }
}
