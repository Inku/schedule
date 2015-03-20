package com.ifeng.schedule.io;

import com.ifeng.schedule.string.StringBufferDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/20.
 */
public class ByteStreamDemo {
    public static void main(String[] args) {
        //demo_write();
        demo_read();
    }

    private static void demo_read() {
        try (FileInputStream fis = new FileInputStream("src/main/resources/byteDemo.txt")) {
            byte[] buf = new byte[1024];
            int len;
            while ((len = fis.read(buf)) != -1) {
                System.out.println(new String(buf, 0, len));
            }

            /*int ch;
            while ((ch = fis.read()) != -1) {
                System.out.println(ch);
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void demo_write() {
        try (FileOutputStream fos = new FileOutputStream("src/main/resources/byteDemo.txt")) {

            fos.write("abcde".getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
