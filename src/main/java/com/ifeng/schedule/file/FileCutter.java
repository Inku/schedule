package com.ifeng.schedule.file;

import java.io.*;
import java.util.*;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/21.
 */
public class FileCutter {
    private static final int SIZE = 1024 * 1024;
    private static File dir = new File("E:\\Download\\partfiles");
    private static File source = new File("E:\\Download\\1.mp3");
    private static File target = new File("E:\\Download\\2.mp3");

    public static void main(String[] args) {
        if (!dir.exists()) {
            dir.mkdirs();
        }

        splitFile(source);
        combineFile(target);
    }

    private static void combineFile(File target) {
        File[] files = dir.listFiles((dir, name) -> name.endsWith(".part"));
        ArrayList<FileInputStream> list = new ArrayList<>();
        SequenceInputStream sis = null;
        FileOutputStream fos = null;
        try {
            for (File f : files) {
                FileInputStream fis = new FileInputStream(f);
                list.add(fis);
            }
            Enumeration<FileInputStream> en = Collections.enumeration(list);
            sis = new SequenceInputStream(en);
            fos = new FileOutputStream(target);

            byte[] buf = new byte[SIZE];
            int len;
            while ((len = sis.read(buf)) != -1) {
                fos.write(buf, 0, len);
                fos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sis != null) {
                try {
                    sis.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭失败");
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭失败");
                }
            }
        }
    }

    private static void splitFile(File file) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file);
            byte[] buf = new byte[SIZE];
            int len;
            int count = 1;
            while ((len = fis.read(buf)) != -1) {
                fos = new FileOutputStream(new File(dir, count + ".part"));
                fos.write(buf, 0, len);
                fos.close();
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭失败");
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭失败");
                }
            }
        }
    }


}
