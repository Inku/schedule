package com.ifeng.schedule.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/21.
 */
public class IOTest {
    private static File path = new File("D:\\workspace\\");
    private static File targetFile = new File("src\\main\\resources\\javaFile.txt");

    public static void main(String[] args) {
        deepListJava(path);
    }

    private static void deepListJava(File path) {
        File[] filelist = path.listFiles();
        if (filelist != null) {
            for (File f : filelist) {
                if (f.isDirectory()) {
                    deepListJava(f);
                } else {
                    String name = f.getAbsolutePath();
                    if (name.endsWith(".java"))
                        writeToFile(name);
                }
            }
        }
    }

    private static void writeToFile(String name) {
        try (BufferedWriter bufw = new BufferedWriter(new FileWriter(targetFile, true))) {
            bufw.write(name);
            bufw.newLine();
            bufw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
