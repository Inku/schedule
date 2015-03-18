package com.ifeng.schedule.other;

import java.io.IOException;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/16.
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process p = runtime.exec("mail.app");
    }
}
