package com.ifeng.schedule.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/23.
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);
        Socket socket = ss.accept();

        OutputStream out = socket.getOutputStream();
        out.write("shoudao".getBytes());

        InputStream in = socket.getInputStream();
        byte[] buf = new byte[1024];
        int len;
        String ip = socket.getInetAddress().getHostAddress();
        while ((len = in.read(buf)) != -1) {
            System.out.print(ip + ":" + new String(buf, 0, len));
        }

        socket.close();
        ss.close();
    }
}
