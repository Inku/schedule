package com.ifeng.schedule.net;

import java.io.IOException;
import java.net.*;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/23.
 */
public class UDPSendDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("发送端启动");
        DatagramSocket socket = new DatagramSocket();
        String data = "udp send demo";
        DatagramPacket packet = new DatagramPacket(data.getBytes(), data.length(), InetAddress.getByName("172.31.17.61"), 10000);
        socket.send(packet);
        socket.close();
    }
}