package com.ifeng.schedule.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/19.
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/main/resources/demo.txt");
        fw.write("abcde"+System.lineSeparator());
        fw.write("hahaha");
        fw.close();
    }
}
