package com.dataStructures.Algorithems.programs;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "JavaJ2eeStrutsHibernate";

        String s2 = "StrutsHibernateJavaJ2ee";
         if (s1.length()==s2.length() && (s1+s1).contains(s2)){
            System.out.println("same");
        }else {
             System.out.println("not same");
         }
    }
}
