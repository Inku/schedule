package com.ifeng.schedule.generic;

import java.util.*;

/**
 * Copyright © 2015 Phoenix New Media Limited All Rights Reserved.
 * <p>
 * Created by zhengpeng on 15/3/18.
 */
public class GenericDemo {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();

        ts.add(new Person("c", 23));
        ts.add(new Person("a", 21));
        ts.add(new Person("d", 24));
        ts.add(new Person("b", 22));

        ts.forEach(x -> System.out.println(x.getName() + "-->" + x.getAge()));

        Tool<Person> tool = new Tool<>();
        tool.setObject(new Person());

        Tool<String> tool1 = new Tool<>();
        tool1.print("123");
        tool1.show(1);
        Tool.method(new Person());

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("a");
        arr1.add("b");
        arr1.add("c");

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);

        printCollection(arr1);
        printCollection(arr2);
    }

    public static <T extends Collection<?>> void printCollection(T t) {
        t.forEach(System.out::println);
        /*
        //replaced by forEach
        Iterator<?> it = t.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        */
    }
}
