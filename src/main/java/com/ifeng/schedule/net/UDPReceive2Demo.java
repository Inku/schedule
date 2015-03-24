package com.ifeng.schedule.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/23.
 */
public class UDPReceive2Demo {
    public static void main(String[] args) {
        byte[] buf = new byte[5];
        try (DatagramSocket socket = new DatagramSocket(10000)) {

            while (true) {
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);
                String ip = packet.getAddress().getHostName();
                int port = packet.getPort();
                String data = new String(packet.getData(), 0, packet.getLength());
                if (data.equals("over")) {
                    break;
                }
                System.out.println(ip + ":" + port + ":" + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
