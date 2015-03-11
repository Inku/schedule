package com.ifeng.schedule.tests;

/**
 * Created by zhengpeng on 15/3/11.
 */
interface Inter{
    void show(int a, int b);

    void func();
}
public class InnerTest {
    public static void main(String[] args) {
        Inter i = new Inter() {
            @Override
            public void show(int a, int b) {
                //show()
            }

            @Override
            public void func() {
                //func()
            }
        };
        i.show(3, 4);
        i.func();
    }
}
