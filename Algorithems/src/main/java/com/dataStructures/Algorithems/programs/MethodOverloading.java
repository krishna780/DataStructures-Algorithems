package com.dataStructures.Algorithems.programs;

public class MethodOverloading {

    static final int ik=200;
    static int i=100;

    static int add(int a, int b) {
        return a+b;
    }
    void sum(int a,long b){System.out.println("a method invoked"+a+b);}
    void sum(long a,int b){System.out.println("b method invoked");}


    static String add(String a, String b) {
        return a+b;
    }

    public static void main(String[] args) {
          MethodOverloading methodOverloading=new MethodOverloading();
          methodOverloading.sum(12,5l);
        int add = MethodOverloading.add(1, 4);
        System.out.println(add);
        System.out.println(i);
        i=129;
        System.out.println(i);
        System.out.println(ik);

        final  int i2;
        i2=34848;
        System.out.println(i2);


    }
}
