package com.ifeng.schedule.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/19.
 */
public class CopyTestDemo {
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/main/resources/demo.txt");
             FileWriter fw = new FileWriter("src/main/resources/demo_copy.txt")) {

            char[] buf = new char[BUFFER_SIZE];
            int len;
            while ((len = fr.read(buf)) != -1) {
                fw.write(buf, 0, len);
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
