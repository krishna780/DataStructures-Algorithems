package com.dataStructures.Algorithems.programs;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str="Better Butter";

        String[] charArray = str.split(" ");

        StringBuilder stringBuilder=new StringBuilder();

        for(String st:charArray){
            stringBuilder.append(st);
        }
        System.out.println(stringBuilder);

        String replace = str.replaceAll("\\s", "");
        System.out.println(replace);
    }
}
