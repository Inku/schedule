package com.ifeng.schedule.collection;

import java.util.*;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/19.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");

        Set<String> set = map.keySet();
        set.forEach(key -> System.out.println(key + "=" + map.get(key)));

        for (String key : set) {
            System.out.println(key + "=" + map.get(key));
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
        }
        entries.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

        Collection<String> coll = map.values();
        coll.forEach(System.out::println);
        /*
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + "=" + map.get(key));
        }
        */
    }
}
