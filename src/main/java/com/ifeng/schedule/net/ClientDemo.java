package com.ifeng.schedule.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/23.
 */
public class ClientDemo {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 10002)) {
            OutputStream out = socket.getOutputStream();
            out.write("tcp演示".getBytes());

            InputStream in = socket.getInputStream();
            byte[] buf = new byte[1024];
            int len = in.read(buf);
            String text = new String(buf, 0, len);
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
