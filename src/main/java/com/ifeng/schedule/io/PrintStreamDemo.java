package com.ifeng.schedule.io;

import java.io.IOException;
import java.io.PrintStream;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/21.
 */
public class PrintStreamDemo {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        try (PrintStream out = new PrintStream("src\\main\\resources\\print.txt")) {
            out.write(97);
            out.print(97);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
