package com.ifeng.schedule.io;

import java.io.*;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/20.
 */
public class CopyPicDemo {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
        method5();
    }

    /**
     * 单个字节拷贝
     * 不要用，效率极低
     */
    private static void method5() {
        try (FileInputStream fis = new FileInputStream("src/main/resources/dp.jpg");
             FileOutputStream fos = new FileOutputStream("src/main/resources/dp_copy5.jpg")) {

            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *创建一个文件等大小数组一次性读取写入
     */
    private static void method4() {
        try (FileInputStream fis = new FileInputStream("src/main/resources/dp.jpg");
             FileOutputStream fos = new FileOutputStream("src/main/resources/dp_copy4.jpg")) {

            byte[] buf = new byte[fis.available()];
            fis.read(buf);
            fos.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 单字节缓冲区缓冲读写
     * 注意不要每个字节都flush()
     */
    private static void method3() {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/resources/dp.jpg"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/main/resources/dp_copy3.jpg"))) {

            int len;
            while ((len = bis.read()) != -1) {
                bos.write(len);
            }
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 自定义缓冲区读写
     * 字节流不需要flush()
     */
    private static void method2() {
        try (FileInputStream fis = new FileInputStream("src/main/resources/dp.jpg");
             FileOutputStream fos = new FileOutputStream("src/main/resources/dp_copy2.jpg")) {

            byte[] buf = new byte[1024];
            int len;
            while ((len = fis.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 自定义缓冲区大小缓冲读写
     * 缓冲区要用flush()
     */
    private static void method1() {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/resources/dp.jpg"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/main/resources/dp_copy1.jpg"))) {

            byte[] buf = new byte[1024];
            int len;
            while ((len = bis.read(buf)) != -1) {
                bos.write(buf, 0, len);
                bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
