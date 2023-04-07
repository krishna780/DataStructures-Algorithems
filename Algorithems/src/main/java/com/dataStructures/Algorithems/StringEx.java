package com.dataStructures.Algorithems;


import java.util.HashSet;
import java.util.Iterator;

public class StringEx {
    public static void main(String[] args) {
        String str1="welcome to the";
        String str2="java";
        String st=new String("java");
        String str3=str1+str2;
        System.out.println(str3);

        System.out.println(st.equals(str2));
        System.out.println(st=str2);

        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("string");
        hashSet.add("jjjsj");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
