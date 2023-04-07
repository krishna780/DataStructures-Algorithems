package com.dataStructures.Algorithems.abstracts;

public class Circle extends Shape{

    double pi=3.14;
    int radius;

    public Circle(String objectName,  int radius) {
        super(objectName);
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn ");
    }
}
