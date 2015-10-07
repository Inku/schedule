package com.ifeng.schedule.abstracts;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/10/7.
 */
public class Circle extends Shape {

    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    @Override
    public double countPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String getType() {
        return "circle";
    }
}
