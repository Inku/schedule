package com.ifeng.schedule.single;

import org.junit.Test;

public class SingleTest {

    @Test
    public void testGetInstance() throws Exception {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1==s2);
    }
}