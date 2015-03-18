package com.ifeng.schedule.collection;

import java.util.LinkedList;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/17.
 */
public class MyQueue {
    private LinkedList<Object> linkedList;

    public MyQueue() {
        linkedList = new LinkedList<>();
    }

    public void add(Object object) {
        linkedList.addLast(object);
    }

    public Object get() {
        return linkedList.removeFirst();
    }

    public Boolean isNull() {
        return linkedList.isEmpty();
    }
}
