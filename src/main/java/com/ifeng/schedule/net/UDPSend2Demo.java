package com.ifeng.schedule.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/23.
 */
public class UDPSend2Demo {
    public static void main(String[] args) {
//        byte[] buf = new byte[1024];
        try (DatagramSocket socket = new DatagramSocket()) {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                String str = scanner.next();
                byte[] buf = str.getBytes();
                DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("localhost"), 10000);
                socket.send(packet);
                if (str.equals("over")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
