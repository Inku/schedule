package com.ifeng.schedule.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Inku on 2015/3/16.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> arr = new HashSet<>();
        arr.add("abc1");
        arr.add("abc2");
        arr.add("abc3");
        arr.add("abc4");

        Iterator<String> iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
