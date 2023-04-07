package com.dataStructures.Algorithems.abstracts;

public class Rectangle extends Shape{
    int length,width;

    Rectangle(String objectName,int length,int width) {
        super(objectName);
        this.length=length;
        this.width=width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
    }
}
