package com.ifeng.schedule.environment;

import java.util.Objects;

/**
 * Created by Inku on 2015/3/10.
 */
public class ObjectsTest {
    static ObjectsTest obj;

    public static void main(String[] args) {
        System.out.println(Objects.hashCode(obj));
        System.out.println(Objects.toString(obj));
        System.out.println(Objects.requireNonNull(obj, "obj can't be null!"));
    }
}