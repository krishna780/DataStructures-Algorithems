package com.dataStructures.Algorithems.SlidingWindow;

public class StringCombinations {
    public static void main(String[] args) {
        String st="abc";
        getCombinationn("", st);
    }

    private static void getCombinationn(String preFix, String st) {
        if (st.length()==0){
            System.out.println(preFix);
        }else {
            for(int i=0;i<st.length();i++){
                char charAt = st.charAt(i);
                String string = st.substring(0, i) + st.substring(i + 1);
                getCombinationn(preFix+charAt,string);
            }
        }
    }
}
