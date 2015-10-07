package com.ifeng.schedule.command;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/10/7.
 */
public class AddCommand implements Command {

    @Override
    public void process(int[] target) {
        int sum = 0;
        for (int i : target) {
            sum += i;
        }
        System.out.println(sum);
    }
}
