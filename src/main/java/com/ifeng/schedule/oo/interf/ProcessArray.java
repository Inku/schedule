package com.ifeng.schedule.oo.interf;

import com.ifeng.schedule.oo.interf.Command;

/**
 * Created by zhengpeng on 15/3/9.
 */
public class ProcessArray {
    public void process(int[] target, Command cmd) {
        cmd.process(target);
    }
}
