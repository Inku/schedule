package com.ifeng.schedule.net;

import java.io.*;
import java.net.Socket;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/24.
 */
public class UploadPicClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 10006);
        FileInputStream fis = new FileInputStream("src/main/resources/dp.jpg");
        OutputStream out = socket.getOutputStream();

        byte[] buf = new byte[1024];
        int len;
        while ((len = fis.read(buf)) != -1) {
            out.write(buf, 0, len);
        }
        socket.shutdownOutput();
        fis.close();

        BufferedReader bur = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String msg = bur.readLine();
        System.out.println("server:" + msg);

        socket.close();
    }
}
