package com.ifeng.schedule.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/20.
 */
public class MyBufferedReader {

    private FileReader fr;
    private char[] buf = new char[1024];
    private int pos = 0;
    private int count = 0;

    public MyBufferedReader(FileReader fr) {
        this.fr = fr;
    }

    public MyBufferedReader(FileReader fr, int buf_size) {
        this.fr = fr;
        this.buf = new char[buf_size];
    }

    public int myRead() throws IOException {
        if (count == 0) {
            count = fr.read(buf);
            pos = 0;
        }
        if (count < 0) {
            return -1;
        }

        count--;
        return buf[pos++];
    }

    public String myReadLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = myRead()) != -1) {
            if (ch == '\r')
                continue;
            if (ch == '\n')
                return sb.toString();
            sb.append((char) ch);
        }
        if (sb.length() > 0)
            return sb.toString();
        return null;
    }

    public void myClose() throws IOException {
        fr.close();
    }

    public static void main(String[] args) {
        MyBufferedReader bufr = null;
        try {
            bufr = new MyBufferedReader(new FileReader("src/main/resources/demo.txt"), 3);
            /*int len = 0;
            while ((len = bufr.myRead()) != -1) {
                System.out.print((char) len);
            }*/

            String str;
            while ((str = bufr.myReadLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufr != null) {
                try {
                    bufr.myClose();
                } catch (IOException e) {
                    //noinspection ThrowFromFinallyBlock
                    throw new RuntimeException("关闭失败");
                }
            }
        }
    }
}
