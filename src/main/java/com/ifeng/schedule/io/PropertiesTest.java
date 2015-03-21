package com.ifeng.schedule.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/21.
 */
public class PropertiesTest {
    private static File count = new File("src/main/resources/count.properties");

    public static void main(String[] args) throws IOException {
        if (!count.exists()) {
            count.createNewFile();
        }
        Properties prop = new Properties();
        prop.load(new FileInputStream(count));
        int num = Integer.parseInt(prop.getProperty("count") == null ? "0" : prop.getProperty("count"));
        num = run(num);
        prop.setProperty("count", num + "");
        prop.store(new FileOutputStream(count), "");
    }

    private static int run(int num) {
        num++;
        if (num > 5) {
            System.out.println("运行已超过五次");
            return num;
        }
        System.out.println("system run");
        System.out.println("runtime=" + num);
        return num;
    }
}
