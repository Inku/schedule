package com.ifeng.schedule.tests;

import java.util.Random;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/10.
 */
public class SeedTest {
    public static void main(String[] args) {
        Random r1 = new Random(50);
        System.out.println(r1.nextBoolean());
        System.out.println(r1.nextInt());
        System.out.println(r1.nextDouble());
        System.out.println(r1.nextGaussian());

        Random r2 = new Random(50);
        System.out.println(r2.nextBoolean());
        System.out.println(r2.nextInt());
        System.out.println(r2.nextDouble());
        System.out.println(r2.nextGaussian());

        Random r3 = new Random(100);
        System.out.println(r3.nextBoolean());
        System.out.println(r3.nextInt());
        System.out.println(r3.nextDouble());
        System.out.println(r3.nextGaussian());
    }
}
