package com.ifeng.schedule.command;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/10/7.
 */
public class CommandTest {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] target = {3, -4, 6, 5};
        pa.process(target, new PrintCommand());
        pa.process(target, new AddCommand());

        pa.process(target, target1 -> {
            for (int i : target1) {
                System.out.println(i);
            }
        });
    }
}
