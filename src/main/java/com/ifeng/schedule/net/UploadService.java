package com.ifeng.schedule.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/24.
 */
public class UploadService implements Runnable {
    private Socket socket;

    public UploadService(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream in = socket.getInputStream();
            FileOutputStream fos = new FileOutputStream("src/main/resources/dpUpload.jpg");

            String ip = socket.getInetAddress().getHostAddress();
            System.out.println(Thread.currentThread().getName() + ":" + ip + ":connected");

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }

            OutputStream out = socket.getOutputStream();
            out.write("upload success".getBytes());

            socket.shutdownOutput();

            fos.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
