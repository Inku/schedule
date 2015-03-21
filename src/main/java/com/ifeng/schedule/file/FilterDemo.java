package com.ifeng.schedule.file;

import java.io.File;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/21.
 */
public class FilterDemo {
    public static void main(String[] args) {
        File file = new File("D:\\workspace\\toDelete");
        deleteTest(file);
        //deepList(file, 0);
        //listJava(file);
    }

    private static void deleteTest(File file) {
        File[] filelist = file.listFiles();
        if (filelist != null) {
            for (File f : filelist) {
                if (f.isDirectory()) {
                    deleteTest(f);
                } else {
                    f.delete();
                }
            }
        }
        file.delete();
    }

    private static void deepList(File file, int level) {
        System.out.println(getSpace(file.getName(), level));
        level++;
        File[] filelist = file.listFiles();
        if (filelist != null) {
            for (File f : filelist) {
                if (f.isDirectory()) {
                    deepList(f, level);
                } else {
                    System.out.println((getSpace(f.getName(), level)));
                }
            }
        }
    }

    private static String getSpace(String name, int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            if (i == level - 1) {
                sb.append("|-");
            } else {
                sb.append("\t");
            }
        }
        sb.append(name);
        return sb.toString();
    }

    private static void listJava(File file) {
        File[] fileList = file.listFiles((dir, name) -> name.endsWith("ames"));
        //File[] fileList = file.listFiles(new SuffixFilter("Games"));//replaced by lambda
        for (File f : fileList) {
            System.out.println(f.getName());
        }
    }
}
