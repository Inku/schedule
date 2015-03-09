package com.ifeng.schedule.oo;

/**
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
