package com.ifeng.schedule.exception;

import java.io.*;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/10.
 */
public class AutoCloseTest {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new FileReader("AutoCloseTest.java"));
                PrintStream ps = new PrintStream(new FileOutputStream("a.txt"))
        ) {
            System.out.println(br.readLine());
        }
    }
}
