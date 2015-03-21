package com.ifeng.schedule.io;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/21.
 */
public class PropertyDemo {
    private static String propPath = "src\\main\\resources\\myProperties.properties";

    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
//        method4();
//        myLoad();
        modify();
    }

    private static void modify() {
        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream(propPath)) {
            prop.load(fis);
            prop.setProperty("wangwu", "16");

            FileOutputStream fos = new FileOutputStream(propPath);
            prop.store(fos, "modify");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void myLoad() {
        Properties prop = new Properties();
        try (BufferedReader bufr = new BufferedReader(new FileReader(propPath))) {
            String line;
            while ((line = bufr.readLine()) != null) {
                if (line.startsWith("#"))
                    continue;
                String[] arr = line.split("=");
                prop.setProperty(arr[0], arr[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        prop.list(System.out);
    }

    private static void method4() {
        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream(propPath)) {
            prop.load(fis);
            prop.list(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method3() {
        Properties prop = new Properties();
        prop.setProperty("zhangsan", "40");
        prop.setProperty("lisi", "30");
        prop.setProperty("wangwu", "50");
        prop.setProperty("zhaoliu", "60");

        try (FileOutputStream fos = new FileOutputStream(propPath)) {
            prop.store(fos, "test");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*try(FileWriter fw = new FileWriter(propPath)){
            prop.store(fw,"properties test");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    private static void method2() {
        Properties prop = new Properties();
        prop.setProperty("zhangsan", "40");
        prop.setProperty("lisi", "30");
        prop.setProperty("wangwu", "50");
        prop.setProperty("zhaoliu", "60");

        prop = System.getProperties();
        prop.list(System.out);
    }

    private static void method1() {
        Properties prop = new Properties();
        prop.setProperty("zhangsan", "30");
        prop.setProperty("lisi", "40");
        prop.setProperty("wangwu", "50");
        prop.setProperty("zhaoliu", "60");

        Set<String> names = prop.stringPropertyNames();
        names.forEach(name -> System.out.println(name + ":" + prop.getProperty(name)));
    }
}
