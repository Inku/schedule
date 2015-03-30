package com.ifeng.schedule.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/28.
 */
public class ConnMySql {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/select_test", "root", "zheng326");
             Statement stat = conn.createStatement()) {

            String query = "select s.*,teacher_name from student_table s,teacher_table t WHERE s.java_teacher=t.teacher_id;";
            ResultSet rs = stat.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
            }
        }
    }
}
