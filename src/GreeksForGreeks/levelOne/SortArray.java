package GreeksForGreeks.levelOne;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] array = {2, 1, 4, 3};
        for (int outer = 0; outer < array.length; outer++) {
            for (int inner = 0; inner < array.length; inner++){
                if (array[outer] < array[inner]){
                    int temp = array[inner];
                    array[inner] = array[outer];
                    array[outer] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        }
}
