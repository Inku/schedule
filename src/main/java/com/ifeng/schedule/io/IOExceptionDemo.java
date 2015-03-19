package com.ifeng.schedule.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/19.
 */
public class IOExceptionDemo {
    public static void main(String[] args) {
        method1();
        method2();
    }

    //一般写法
    private static void method1() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/main/resources/demo.txt", true);
            fw.write("normal1");
            fw.write("normal2");
            fw.write("normal3");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    //noinspection ThrowFromFinallyBlock
                    throw new RuntimeException("关闭失败");
                }
            }
        }
    }

    //JDK7资源自动关闭写法
    private static void method2() {
        try (FileWriter fw = new FileWriter("src/main/resources/demo.txt", true)) {
            fw.write("auto1");
            fw.write("auto2");
            fw.write("auto3");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
