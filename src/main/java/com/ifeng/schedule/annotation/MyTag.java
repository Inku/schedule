package com.ifeng.schedule.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/26.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTag {
    String name() default "defaultName";
    int age() default 18;
}
