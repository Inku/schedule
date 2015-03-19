package com.ifeng.schedule.generic;

/**
 * Copyright © 2015 Phoenix New Media Limited All Rights Reserved.
 *
 * Created by zhengpeng on 15/3/18.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        int temp = this.age - o.age;
        return temp == 0 ? this.name.compareTo(o.getName()) : temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
