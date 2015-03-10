package com.ifeng.schedule.tests;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Inku on 2015/3/10.
 */
public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextBoolean());

        byte[] buffer = new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));

        System.out.println(rand.nextDouble());
        System.out.println(rand.nextFloat());
        System.out.println(rand.nextGaussian());
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt(10));
        System.out.println(rand.nextLong());
    }
}
