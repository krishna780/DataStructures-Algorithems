package com.dataStructures.Algorithems.hashing;

import java.util.ArrayList;
import java.util.List;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] ints={1,2,3,4};
        boolean duplicate = findDuplicate(ints);
        System.out.println(duplicate);
    }

    private static boolean findDuplicate(int[] ints) {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<ints.length;i++){
            if(list.contains(ints[i])){
                return true;
            }else {
                list.add(ints[i]);
            }
        }
        return false;
    }
}
