package com.ifeng.schedule.command;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/10/7.
 */
public class PrintCommand implements Command {
    @Override
    public void process(int[] target) {
        for (int i : target) {
            System.out.println(i);
        }
    }
}
