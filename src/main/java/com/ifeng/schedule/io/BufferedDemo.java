package com.ifeng.schedule.io;

import java.io.*;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/19.
 */
public class BufferedDemo {
    public static void main(String[] args) {
//        writerTest();
//        readerTest();
        copyTest();
    }

    private static void copyTest() {
        try (BufferedWriter bufw = new BufferedWriter(new FileWriter("src/main/resources/demo_copy.txt"));
             BufferedReader bufr = new BufferedReader(new FileReader("src/main/resources/demo.txt"))) {

            String line;
            while ((line = bufr.readLine())!=null) {
                bufw.write(line);
                bufw.newLine();
                bufw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readerTest() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/demo.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writerTest() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/demo.txt", true))) {
            bw.append("test");
            bw.newLine();
            bw.append("line2");
            bw.newLine();
            bw.write("line3");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
