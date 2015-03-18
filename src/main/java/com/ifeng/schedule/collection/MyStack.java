package com.ifeng.schedule.collection;

import java.util.LinkedList;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/17.
 */
public class MyStack {
    private LinkedList<Object> linkedList;

    public MyStack() {
        linkedList = new LinkedList<>();
    }

    public void add(Object object) {
        linkedList.add(object);
    }

    public Object get() {
        return linkedList.removeLast();
    }

    public Boolean isNull() {
        return linkedList.isEmpty();
    }
}
