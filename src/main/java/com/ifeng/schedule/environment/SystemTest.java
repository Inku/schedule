package com.ifeng.schedule.environment;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * Created by zhengpeng on 15/3/10.
 */
public class SystemTest {
    public static void main(String[] args) throws IOException {
        Map<String,String> env = System.getenv();
        for (String name : env.keySet()) {
            System.out.println(name+"-->"+env.get(name));
        }
        Properties props = System.getProperties();
        props.store(new FileOutputStream("target/props.txt"), "System properties");
        System.out.println(System.getProperty("os.name"));
    }
}
