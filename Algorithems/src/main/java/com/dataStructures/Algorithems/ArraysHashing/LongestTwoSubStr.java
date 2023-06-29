package com.dataStructures.Algorithems.ArraysHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestTwoSubStr {
    public static void main(String[] args) {
        String str = "aabbcc";
        String[] charArray = str.split("");
        List<String> list=new ArrayList<>();
        String ll = "";
        int k=2,size =0,newsize=0;
        for (int i = 0; i < charArray.length; i++) {
            String s = charArray[i];
            if(list.contains(s) && k!=0){
                list.add(s);
                i = list.lastIndexOf(s);
                size=  list.size();
                k--;
            }else {
                list.add(s);
            }
            if(size>newsize){
                newsize=size;
                ll= list.toString();
            }
        }
        System.out.println(ll);
    }
}
