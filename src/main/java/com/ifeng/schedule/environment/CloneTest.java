package com.ifeng.schedule.environment;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/10.
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User(10);
        User user2 = user1.clone();
        System.out.println(user1);
        System.out.println(user2);
        user2.address.detail = "sh";
        System.out.println(user1);
        System.out.println(user2);
    }
}

class Address {
    String detail;

    public Address(String detail) {
        this.detail = detail;
    }

}

class User implements Cloneable {
    int age;
    Address address;

    public User(int age) {
        this.age = age;
        address = new Address("bj");
    }

    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    @Override
    public String toString() {
        return this.age + ":" + this.address.detail;
    }
}
