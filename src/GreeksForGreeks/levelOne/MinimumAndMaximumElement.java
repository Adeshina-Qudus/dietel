package GreeksForGreeks.levelOne;

import java.util.Arrays;

public class MinimumAndMaximumElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minimumAndMaximum(24, 5, 78, 96, 45, 100, 45)));
    }

    public static int [] minimumAndMaximum(int ...numbers){

        int [] result = new int[2];
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
                result[0] = smallest;
            }
            if (number > largest ) {
                largest = number;
                result[1] = largest;
            }
        }
        return result;
    }
}
