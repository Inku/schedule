package com.ifeng.schedule.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/24.
 */
public class WebDemo {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();

        InputStream in = socket.getInputStream();
        byte[] buf = new byte[1024];
        int len;
        len = in.read(buf);
        String text = new String(buf, 0, len);
        System.out.println(text);

        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        out.println("welcome hello world");
        socket.close();
        ss.close();
    }
}
