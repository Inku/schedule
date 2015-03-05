package com.ifeng.schedule.inheritance;

/**
 * Created by Inku on 2015/3/5.
 */
public class Student extends Person {

    int age = 9;

    void study() {
        System.out.println(super.age);
        System.out.println(this.age);
    }
}
