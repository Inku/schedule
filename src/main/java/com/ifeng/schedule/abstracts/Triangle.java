package com.ifeng.schedule.abstracts;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/10/7.
 */
public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double countPerimeter() {
        return a+b+c;
    }

    @Override
    public String getType() {
        return "triangle";
    }
}
