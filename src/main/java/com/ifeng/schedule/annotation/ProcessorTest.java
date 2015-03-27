package com.ifeng.schedule.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/26.
 */
public class ProcessorTest {
    public static void main(String[] args) throws ClassNotFoundException {
        for (Method m : Class.forName("com.ifeng.schedule.annotation.MyTest").getMethods()) {
            if (m.isAnnotationPresent(Testable.class)) {
                try {
                    m.invoke(null);
                } catch (InvocationTargetException | IllegalAccessException e) {
                    System.out.println("method:" + m + "run failed");
                }
            }
        }
    }
}
