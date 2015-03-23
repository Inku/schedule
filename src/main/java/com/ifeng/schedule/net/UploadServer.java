package com.ifeng.schedule.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/23.
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10005);
        Socket socket = serverSocket.accept();

        BufferedReader bufin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bufout = new BufferedWriter(new FileWriter("src\\main\\resources\\server.txt"));

        String line;
        while ((line = bufin.readLine()) != null) {
            bufout.write(line);
            bufout.newLine();
            bufout.flush();
        }

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("传输成功");
        bufout.close();
        socket.close();
        serverSocket.close();
    }
}
