package com.ifeng.schedule.sql

import org.junit.Test

/**
 * Created by Inku on 2015/3/4.
 */
class SqlToolTest extends GroovyTestCase {
    @Test
    void testSelectByParentId() {
        def sqlTool = new SqlTool();
        println sqlTool.selectByParentId(12795)
    }
}
