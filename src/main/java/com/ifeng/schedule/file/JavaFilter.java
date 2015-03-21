package com.ifeng.schedule.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Copyright ©Inku. All rights reserved.
 * Created by Inku on 2015/3/21.
 */
public class JavaFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".java");
    }
}
