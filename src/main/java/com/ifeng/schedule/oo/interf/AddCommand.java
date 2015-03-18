package com.ifeng.schedule.oo.interf;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/9.
 */
public class AddCommand implements Command {
    @Override
    public void process(int[] target) {
        int sum = 0;
        for (int tmp : target) {
            sum += tmp;
        }
        System.out.println("元素总和是:" + sum);
    }
}
