package com.ifeng.schedule.oo.polymorphic;

/**
 * Created by Inku on 2015/3/9.
 */
public class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("cat eat");
    }

    void catchMouse(){
        System.out.println("抓老鼠");
    }
}
