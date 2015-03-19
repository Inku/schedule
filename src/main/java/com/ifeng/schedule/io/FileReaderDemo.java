package com.ifeng.schedule.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/19.
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1() {
        try (FileReader fr = new FileReader("src/main/resources/demo.txt")) {
            int tmp;
            while ((tmp = fr.read()) != -1) {
                System.out.println((char) tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method2() {
        char[] buf = new char[3];
        try (FileReader fr = new FileReader("src/main/resources/demo.txt")) {
            int num;
            while((num = fr.read(buf))!=-1)
            {
                System.out.println(num + ":" + new String(buf,0,num));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
