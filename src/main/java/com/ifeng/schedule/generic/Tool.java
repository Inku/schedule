package com.ifeng.schedule.generic;

/**
 * Copyright © 2015 Phoenix New Media Limited All Rights Reserved.
 * <p>
 * Created by zhengpeng on 15/3/18.
 */
public class Tool<T> {
    private T t;

    public void setObject(T t) {
        this.t = t;
    }

    public T getObject() {
        return this.t;
    }

    public <E> void show(E e) {
        System.out.println("show:" + e);
    }

    public void print(T t) {
        System.out.println("print:" + t);
    }

    public static <M> void method(M m) {
        System.out.println("method:" + m);
    }
}
