package com.ifeng.schedule.environment;

/**
 * Created by Inku on 2015/3/10.
 */
public class RuntimeTest {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.availableProcessors());
        System.out.println(rt.freeMemory());
        System.out.println(rt.totalMemory());
        System.out.println(rt.maxMemory());
    }
}
