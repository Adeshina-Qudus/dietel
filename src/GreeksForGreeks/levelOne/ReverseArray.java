package GreeksForGreeks.levelOne;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] array = {67,98,43,89,375};
        int [] reverseArray = new int[array.length];
        int change = 0 ;
        for (int count = array.length -1; count >= 0 ; count--) {
            reverseArray[change] = array[count];
            change++;
        }
            System.out.println(Arrays.toString(reverseArray));
    }
}
