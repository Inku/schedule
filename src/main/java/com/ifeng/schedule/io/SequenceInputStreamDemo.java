package com.ifeng.schedule.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/21.
 */
public class SequenceInputStreamDemo {
    public static void main(String[] args) throws IOException {
        
        /*Vector<FileInputStream> vector = new Vector<>();
        vector.add(new FileInputStream("src\\main\\resources\\1.txt"));
        vector.add(new FileInputStream("src\\main\\resources\\2.txt"));
        vector.add(new FileInputStream("src\\main\\resources\\3.txt"));*/

        ArrayList<FileInputStream> arrayList = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            arrayList.add(new FileInputStream("src\\main\\resources\\" + i + ".txt"));
        }

        Enumeration<FileInputStream> en = Collections.enumeration(arrayList);
        SequenceInputStream sis = new SequenceInputStream(en);

        FileOutputStream fos = new FileOutputStream("src\\main\\resources\\total.txt");
        byte[] buf = new byte[1024];
        int len;
        while ((len = sis.read(buf)) != -1) {
            fos.write(buf, 0, len);
            fos.flush();
        }
        fos.close();
        sis.close();


    }
}
