package com.ifeng.schedule.file;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/20.
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        //constructorDemo();
        //methodDemo();
        createAndDeleteDemo();
    }

    private static void createAndDeleteDemo() throws IOException {
        File file = new File("src/main/resources/fileDemo.txt");
        if (file.exists()) {
            file.delete();
        } else {
            file.createNewFile();
        }
    }

    private static void methodDemo() {
        File file = new File("src/main/resources/fileDemo.txt");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());

        Date date = new Date(file.lastModified());
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
        String str = df.format(date);
        System.out.println(str);

    }

    public static void constructorDemo() {
        File file1 = new File("src/main/resources/fileDemo.txt");
        File file2 = new File("src/main/resources/", "fileDemo.txt");
        File resources = new File("src/main/resources/");
        File file3 = new File(resources, "fileDemo.txt");
    }
}
