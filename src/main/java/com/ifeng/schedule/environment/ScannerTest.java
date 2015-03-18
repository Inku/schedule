package com.ifeng.schedule.environment;

import java.util.Scanner;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/10.
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String tmp = sc.next();
            if (tmp.equals("exit"))
                return;
            System.out.println(tmp);
        }
    }
}
