package com.ifeng.schedule.environment;

import java.io.IOException;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/10.
 */
public class ExecTest {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        rt.exec("notepad.exe");
    }
}
