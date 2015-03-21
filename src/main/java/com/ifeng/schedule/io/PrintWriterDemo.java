package com.ifeng.schedule.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/21.
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);

        String line;
        while ((line = bufr.readLine()) != null) {
            if (line.equals("over")) {
                break;
            }
            out.println(line.toUpperCase());
        }
        out.close();
    }
}
