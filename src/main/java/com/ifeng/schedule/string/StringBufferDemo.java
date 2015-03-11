package com.ifeng.schedule.string;

/**
 * Created by zhengpeng on 15/3/11.
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello world");
        sb.insert(4,"haha");
        System.out.println(sb);
    }
}
