package com.dataStructures.Algorithems.programs;

import java.util.List;

public class ArmostrongEx {
    public static void main(String[] args) {
        List<Integer> integers = List.of(153, 9474, 54748, 124);

        for (int i:integers){
            armostrong(i);
        }
    }

    private static void armostrong(int in) {
        int or=in;
        String string = String.valueOf(in);
        int tot = 0;
        while (in!=0){
            int iu = in % 10;
            int temp = 1;
            for(int i=0;i<string.length();i++){
                temp=temp*iu;
            }
            in=in/10;
            tot=tot+temp;
        }
        if(tot == or) {
            System.out.println("equal");
        }else{
            System.out.println("not");
        }
    }
}
