package com.ifeng.schedule.net;

import java.io.*;
import java.net.Socket;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/23.
 */
public class UploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 10005);
        BufferedReader bufr = new BufferedReader(new FileReader("src\\main\\resources\\client.txt"));

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String line;
        while ((line = bufr.readLine()) != null) {
            out.println(line);
        }
        socket.shutdownOutput();

        BufferedReader bufin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String msg = bufin.readLine();
        System.out.println(msg);
        bufr.close();
        socket.close();
    }
}
