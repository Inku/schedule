package com.ifeng.schedule.oo;

/**
 * Created by zhengpeng on 15/3/9.
 */

public class ImmutableStringTest
{
    public static void main(String[] args)
    {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        //输出false
        System.out.println(str1 == str2);
        //输出true
        System.out.println(str1.equals(str2));
        //下面两次输出的hashCode相同
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
