package com.ifeng.schedule.sql;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/3.
 */
public class SqlDemo {
    public static void main(String[] args) throws Exception {
        int rootid = 12795;

        SqlTool st = new SqlTool();
        String result = (rootid+1000000000)+",";
        List<Map<String, String>> list = st.selectByParentId(rootid);
        for (int i = 0; i < list.size(); i++) {
            Map<String, String> map = list.get(i);
            int id = Integer.parseInt(map.get("id")) + 1000000000;
            String synclass = map.get("synclass");

            result = result + id + ",";
            if (synclass != null && !synclass.equals(""))
                result = result + synclass + ",";
        }

        String[] StringArr = result.split(",");
        int[] intArr = new int[StringArr.length];
        for (int i = 0; i < StringArr.length; i++) {
            intArr[i] = Integer.parseInt(StringArr[i]);
        }
        Arrays.sort(intArr);

        String str = "";
        for (int i : intArr) {
            str = str + i + ",";
        }
        System.out.println(str);

        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/main/resources/columnForNews.txt"), false));
        writer.write(str);
        writer.close();
    }
}
