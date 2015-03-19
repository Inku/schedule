package com.ifeng.schedule.generic;

/**
 * Copyright © 2015 Phoenix New Media Limited All Rights Reserved.
 * <p>
 * Created by zhengpeng on 15/3/18.
 */
public class InterImpl implements Inter<String> {
    @Override
    public void show(String s) {
        System.out.println("show:" + s);
    }
}
