package com.dataStructures.Algorithems.ArraysHashing;

public class ValidPalandrem {
    public static void main(String[] args) {
      String  s = "A man, a plan, 0 a canal: Panama";
        String s1 = s.replaceAll("[^A-Za-z]", "");
        StringBuilder stringBuilder=new StringBuilder(s1).reverse();
        if(s1.toLowerCase().equals(stringBuilder.toString().toLowerCase())){
            System.out.println("paldaram");
        }
    }
}
