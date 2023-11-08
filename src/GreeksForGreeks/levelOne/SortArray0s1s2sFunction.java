package GreeksForGreeks.levelOne;

public class SortArray0s1s2sFunction {

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
