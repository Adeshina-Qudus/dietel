package GreeksForGreeks.levelOne;

public class MinimumAndMaximumElementFunction {

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
