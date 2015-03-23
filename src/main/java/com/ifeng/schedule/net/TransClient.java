package com.ifeng.schedule.net;

import java.io.*;
import java.net.Socket;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/23.
 */
public class TransClient {

    private Socket socket;

    public TransClient(Socket socket) {
        this.socket = socket;
    }

    public void start() {
        try {
            BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
            String line;
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader burin = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while ((line = bufr.readLine()) != null) {
                if (line.equals("over")) {
                    break;
                }
                out.println(line);

                String upperStr = burin.readLine();
                System.out.println(upperStr);
            }

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        TransClient client = new TransClient(new Socket("localhost", 10004));
        client.start();
    }
}
