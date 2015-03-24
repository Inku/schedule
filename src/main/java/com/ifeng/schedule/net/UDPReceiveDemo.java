package com.ifeng.schedule.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/23.
 */
public class UDPReceiveDemo {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(10000)) {
            System.out.println("接收端启动");

            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            String ip = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            String data = new String(packet.getData(), 0, packet.getLength());
            System.out.println(ip + ":" + port + ":" + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
