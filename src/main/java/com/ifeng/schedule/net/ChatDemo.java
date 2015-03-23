package com.ifeng.schedule.net;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/23.
 */
public class ChatDemo {
    public static void main(String[] args) throws SocketException {
        Send send = new Send(new DatagramSocket());
        Receive receive = new Receive(new DatagramSocket(10000));

        Thread t1 = new Thread(receive);
        Thread t2 = new Thread(send);
        t1.start();
        t2.start();
    }
}
