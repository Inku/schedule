package com.ifeng.schedule.oo;

/**
 * Created by zhengpeng on 15/3/9.
 */
public class Varargs {
    public static void test(int a, String... books) {
        for (String tmp : books) {
            System.out.println(tmp);
        }
    }

    public static void main(String[] args) {
        test(5, "book1", "book2");
    }
}
