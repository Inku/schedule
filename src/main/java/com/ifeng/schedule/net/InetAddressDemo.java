package com.ifeng.schedule.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/23.
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        ip = InetAddress.getByName("www.baidu.com");

        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
    }
}
