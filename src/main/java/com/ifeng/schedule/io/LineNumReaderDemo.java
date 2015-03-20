package com.ifeng.schedule.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/20.
 */
public class LineNumReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/main/resources/demo.txt")) {
            LineNumberReader lnr = new LineNumberReader(fr);
            String line;
            while ((line = lnr.readLine()) != null) {
                System.out.println(lnr.getLineNumber()+":"+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
