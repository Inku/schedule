package com.ifeng.schedule.oo.polymorphic;

/**
 * Created by Inku on 2015/3/9.
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        Animal c = new Cat();
        Animal d = new Dog();
        System.out.println(compare(c));
    }

    public static void method(Animal a) {
        a.eat();
    }

    public static String compare(Animal a) {
        if (a instanceof Cat) {
            return "this is cat";
        } else if (a instanceof Dog) {
            return "this is dog";
        }
        return null;
    }
}
