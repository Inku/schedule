package com.ifeng.schedule.oo.interf;

import com.ifeng.schedule.oo.interf.Command;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/9.
 */
public class PrintCommand implements Command {
    @Override
    public void process(int[] target) {
        for (int tmp : target) {
            System.out.println("迭代输出:" + tmp);
        }
    }
}
