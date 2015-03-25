package com.ifeng.schedule.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/24.
 */
public class UploadPicServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10006);
        while (true) {
            Socket socket = ss.accept();
            new Thread(new UploadService(socket)).start();
        }
    }
}
