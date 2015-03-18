package com.ifeng.schedule.collection;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by zhengpeng on 15/3/17.
 */
public class CollectionDemo {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add("abc1");
        queue.add("abc2");
        queue.add("abc3");
        while (!queue.isNull()) {
            System.out.println(queue.get());
        }

        MyStack stack = new MyStack();
        stack.add("abc1");
        stack.add("abc2");
        stack.add("abc3");
        while (!stack.isNull()) {
            System.out.println(stack.get());
        }
    }
}
