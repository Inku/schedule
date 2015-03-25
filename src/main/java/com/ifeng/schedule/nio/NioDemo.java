package com.ifeng.schedule.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/25.
 */
public class NioDemo {
    public static void main(String[] args) throws IOException {
        Files.copy(Paths.get("src/main/resources/demo.txt"),new FileOutputStream("src/main/resources/FilesDemo.txt"));
    }
}
