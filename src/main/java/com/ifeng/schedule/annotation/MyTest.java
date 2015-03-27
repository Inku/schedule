package com.ifeng.schedule.annotation;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/26.
 */
public class MyTest {
    @Testable
    public static void m1() {
    }

    public static void m2() {
    }

    @Testable
    public static void m3() {
        throw new RuntimeException("m3 boom");
    }

    public static void m4() {
    }

    @Testable
    public static void m5() {
    }

    public static void m6() {
    }

    @Testable
    public static void m7() {
        throw new RuntimeException("m7 crash");
    }

    public static void m8() {
    }
}
