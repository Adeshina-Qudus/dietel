package GreeksForGreeks.levelOne;

import java.util.Arrays;

public class MoveAllNegativeNumbers{
    public static void main(String[] args) {


        int [] array = {-12,11,-13,-5,6,-7,5,-3,-6};
        for (int outter = 0 ; outter < array.length; outter++){
            for (int inner = 0; inner < array.length; inner++){
                if (array[outter] < array[inner]){
                    int temp = array[inner];
                    array[inner] = array[outter];
                    array[outter] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
