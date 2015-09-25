package com.ifeng.schedule.thread1;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by sheng on 2015/9/24.
 */
public class TicketDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        new Thread(t::saleTicket).start();
        new Thread(t::saleTicket).start();
        new Thread(t::saleTicket).start();
        new Thread(t::saleTicket).start();
    }
}
