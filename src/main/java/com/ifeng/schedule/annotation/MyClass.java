package com.ifeng.schedule.annotation;

import java.lang.annotation.Annotation;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/26.
 */
@Test
public class MyClass {
    @MyTag
    @Test
    public void info() {
        System.out.println("info");
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Annotation[] arr = Class.forName("com.ifeng.schedule.annotation.MyClass").getMethod("info").getAnnotations();
        for (Annotation a : arr) {
            System.out.println(a);
        }
    }
}
