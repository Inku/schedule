package com.ifeng.schedule.io;

import java.io.*;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/21.
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObj();
        readObj();
    }

    private static void readObj() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\main\\resources\\obj.object"));
        Object obj = ois.readObject();
        MyPerson person = (MyPerson) obj;
        System.out.println(person.getName() + person.getAge());
    }

    private static void writeObj() throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\main\\resources\\obj.object"));
        oos.writeObject(new MyPerson("ceshi", 20));

    }
}
