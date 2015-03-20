package com.ifeng.schedule.io;

import java.io.*;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/20.
 */
public class CodingDemo {
    private static String filePath = "src/main/resources/trans.txt";

    public static void main(String[] args) {
        String str = "中文测试";
        writeEncoding(str);
    }

    private static void writeEncoding(String str) {
        try (BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8"))) {
            bufw.write(str);
            bufw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
