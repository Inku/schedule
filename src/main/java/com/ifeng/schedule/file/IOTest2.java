package com.ifeng.schedule.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/21.
 */
public class IOTest2 {
    private static File path = new File("D:\\workspace\\");
    private static File destFile = new File("src\\main\\resources\\javaFile.txt");

    public static void main(String[] args) {
        FilenameFilter fileter = (dir, name) -> name.endsWith(".java");
        List<File> list = new ArrayList<>();
        getFiles(path, fileter, list);
        write2File(list, destFile);
    }

    private static void write2File(List<File> list, File destFile) {
        try (BufferedWriter bufw = new BufferedWriter(new FileWriter(destFile))) {
            for (File file : list) {
                bufw.write(file.getAbsolutePath());
                bufw.newLine();
            }
            bufw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFiles(File dir, FilenameFilter filter, List<File> list) {
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    getFiles(file, filter, list);
                } else {
                    if (filter.accept(dir, file.getName())) {
                        list.add(file);
                    }
                }
            }
        }
    }
}
