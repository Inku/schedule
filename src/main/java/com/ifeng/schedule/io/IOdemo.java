package com.ifeng.schedule.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Copyright © 2013 Phoenix New Media Limited All Rights Reserved.
 * <p/>
 * Created by zhengpeng on 15/3/4.
 */
public class IOdemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("columnForNews.txt"));
        String str = "";
        String inline = null;
        while ((inline = reader.readLine()) != null) {
            str += inline;
        }

        System.out.println(str);
    }
}
