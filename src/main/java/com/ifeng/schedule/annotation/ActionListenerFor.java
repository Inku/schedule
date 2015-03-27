package com.ifeng.schedule.annotation;

import java.awt.event.ActionListener;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/27.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ActionListenerFor {
    Class<? extends ActionListener> listener();
}
