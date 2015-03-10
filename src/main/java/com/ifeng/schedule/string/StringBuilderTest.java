package com.ifeng.schedule.string;

/**
 * Created by Inku on 2015/3/10.
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("java");
        sb.insert(0, "hello");
        System.out.println(sb);
    }
}
