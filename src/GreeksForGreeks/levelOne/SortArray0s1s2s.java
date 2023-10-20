package GreeksForGreeks.levelOne;

import java.util.Arrays;

public class SortArray0s1s2s {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1})));
    }

    public static int[] sortArray(int[] numbers){
        for (int outter = 0 ; outter < numbers.length; outter++){
            for (int inner = 0; inner < numbers.length; inner++){
                if (numbers[outter] < numbers[inner]){
                    int temp = numbers[inner];
                    numbers[inner] = numbers[outter];
                    numbers[outter] = temp;
                }
            }
        }
        return numbers;
    }
}
