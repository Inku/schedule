package com.ifeng.schedule.io;

import java.io.Serializable;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/21.
 */
public class MyPerson implements Serializable {
    private static final long serialVersionUID = 1384416324297336523L;
    private String name;
    private int age;

    public MyPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
