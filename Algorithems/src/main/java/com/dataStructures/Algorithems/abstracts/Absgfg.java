package com.dataStructures.Algorithems.abstracts;

public class Absgfg {
    public static void main(String[] args) {
        Shape rect=new Rectangle("Rectangle",2,3);
        System.out.println("Area of rectangle:"+rect.area());
        rect.moveTo(1,2);
        Shape circle=new Circle("circle",3);
        System.out.println("Area of rectangle:"+circle.area());
        rect.moveTo(1,2);


    }
}
