package com.ifeng.schedule.io;

import java.io.*;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/20.
 */
public class TransformDemo {

    private static String filePath = "src/main/resources/trans.txt";

    public static void main(String[] args) {
        writeToFile();
        showOnConsole();
    }

    private static void showOnConsole() {
        try (BufferedReader bufr = new BufferedReader(new FileReader("src/main/resources/trans.txt"))) {
            BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
            String line;
            while ((line = bufr.readLine()) != null) {
                bufw.write(line);
                bufw.newLine();
                bufw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile() {
        try (BufferedWriter bufw = new BufferedWriter(new FileWriter(filePath))) {
            BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

            String line;
            while ((line = bufr.readLine()) != null) {
                if (line.equals("over")) {
                    break;
                }
                bufw.write(line);
                bufw.newLine();
                bufw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
