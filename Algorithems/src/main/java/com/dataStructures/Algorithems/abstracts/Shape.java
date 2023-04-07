package com.dataStructures.Algorithems.abstracts;

public abstract class Shape {
    String objectName=" ";
    Shape(String objectName){
        this.objectName=objectName;
    }
    public void moveTo(int x, int y){
        System.out.println(this.objectName+" "+"has been moved to"+" x = "+x+"and" +
                " y ="+y);
    }
    abstract public double area();
    abstract public void draw();

}
