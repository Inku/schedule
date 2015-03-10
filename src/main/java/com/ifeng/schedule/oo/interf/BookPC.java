package com.ifeng.schedule.oo.interf;

/**
 * Created by Inku on 2015/3/9.
 */
public class BookPC {
    public static void main(String[] args) {
        useUSB(new Mouse());
    }

    public static void useUSB(USB usb) {
        usb.open();
        usb.close();
    }
}
