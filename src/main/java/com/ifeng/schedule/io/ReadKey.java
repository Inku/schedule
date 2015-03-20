package com.ifeng.schedule.io;

import java.io.*;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/20.
 */
public class ReadKey {

    public static void main(String[] args) throws IOException {
        //readKey();
        //readKey2();
        readKye3();
    }

    private static void readKye3() throws IOException {
        BufferedReader bur = new BufferedReader(new InputStreamReader(System.in));//字节转字符
        BufferedWriter buw = new BufferedWriter(new OutputStreamWriter(System.out));//字符转字节
        String line;
        while ((line = bur.readLine()) != null) {
            if (line.equals("over")) {
                break;
            }
            buw.write(line.toUpperCase());
            buw.newLine();
            buw.flush();
        }
    }

    private static void readKey2() throws IOException {
        StringBuilder sb = new StringBuilder();
        InputStream in = System.in;
        int ch;
        while ((ch = in.read()) != -1) {
            if (ch == '\n') {
                String tmp = sb.toString();
                if (tmp.equals("over")) {
                    break;
                } else {
                    System.out.println(tmp.toUpperCase());
                    sb.delete(0, sb.length());
                }
            } else {
                sb.append((char) ch);
            }
        }
    }

    /**
     * 基本演示
     *
     * @throws IOException
     */
    private static void readKey() throws IOException {
        InputStream in = System.in;//默认输入设备，不要关
        int ch = in.read();//阻塞方法
        System.out.println(ch);
    }
}
