package com.dataStructures.Algorithems.programs;

public class LargestNumber {
    static int getLLessThanN(int number, int digit)
    {
        //Converting digit to char

        char c = Integer.toString(digit).charAt(0);

        //Decrementing number & checking whether it contains digit

        for (int i = number; i > 0; --i)
        {
            int i1 = Integer.toString(i).indexOf(c);
            if( i1== -1)
            {
                //If 'i' doesn't contain 'c'

                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {

        System.out.println(getLLessThanN(45825, 5));

        System.out.println(getLLessThanN(98512, 5));

        System.out.println(getLLessThanN(548624, 8));
    }
}
