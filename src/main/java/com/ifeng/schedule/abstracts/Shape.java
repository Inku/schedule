package com.ifeng.schedule.abstracts;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/10/7.
 */
public abstract class Shape {
    private String color;
    public abstract double countPerimeter();
    public abstract String getType();

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
