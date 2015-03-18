package com.ifeng.schedule.oo.polymorphic;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/9.
 */
public class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("dog eat");
    }

    void lookHome(){
        System.out.println("看家");
    }
}
