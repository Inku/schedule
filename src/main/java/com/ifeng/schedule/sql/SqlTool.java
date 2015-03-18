package com.ifeng.schedule.sql;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/3.
 */
public class SqlTool {

    private String url = "jdbc:mysql://211.151.61.100:3306/imcms";
    private String user = "rkaifa";
    private String password = "CeT_bww61a6qfTEN";

    private Connection conn = null;

    public SqlTool() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.setLoginTimeout(0);//连接超时时间
            conn = DriverManager.getConnection(url, user, password);

        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    public void closeSource() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public List<Map<String, String>> selectByParentId(int parentid) throws Exception {

        String sql = "select id,synclass,(select count(*) from imcms_class t2 where t2.parentId=t1.id) as leafCount from imcms_class t1 where parentid=" + parentid + " order by id";
        List<Map<String, String>> result = null;

        Statement stat = null;
        ResultSet rs = null;

        stat = conn.createStatement();
        stat.setQueryTimeout(0);//SQL执行超时时间
        rs = stat.executeQuery(sql);
        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        result = new ArrayList<Map<String, String>>();
        while (rs.next()) {
            Map<String, String> map = new HashMap<String, String>();
            for (int i = 1; i <= columnCount; i++) {
                map.put(metaData.getColumnLabel(i), rs.getString(i));
            }
            result.add(map);
        }
        if (rs != null) {
            rs.close();
        }
        if (stat != null) {
            stat.close();
        }

        for (int i = 0; i<result.size(); i++) {
            Map<String, String> map = result.get(i);
            int id = Integer.parseInt(map.get("id"));
            int leafCount = Integer.parseInt(map.get("leafCount"));
            if (leafCount != 0) {
                result.addAll(selectByParentId(id));
            }
        }

        return result;
    }
}
