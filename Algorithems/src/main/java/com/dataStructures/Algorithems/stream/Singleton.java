package com.dataStructures.Algorithems.stream;

public class Singleton {

    private  static Singleton insttanc=null;

    private Singleton() {
        System.out.println("single ton");
    }

    public static Singleton getInstance(){

        if(insttanc!=null){
            return insttanc;
        }
        synchronized(Singleton.class) {
            if (insttanc != null){
                return insttanc;
            }else {
                insttanc = new Singleton();
            }
         }
      return insttanc;
    }
}
