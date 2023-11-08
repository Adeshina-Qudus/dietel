package ClassWork;

import java.util.Arrays;

public class MinMax {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumMinMax(new int[]{5,3,4,1,2})));
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int count : numbers) {
            sum += count;
        }
        return sum;
    }

    public static int minimum(int[] numbers){
        int minimum = numbers[0];
        for (int count : numbers){
            if (count <  minimum){
                minimum = count;
            }
        }
        return minimum;
    }

    public static int maximum(int[] numbers){
        int maximum = numbers[0];
        for (int count = 0 ; count < numbers.length ; count++){
            if (count > maximum){
                maximum = numbers[count];
            }
        }return maximum;
    }


    public static int[] sumMinMax(int [] numbers){
        int minimum = sum(numbers) - minimum(numbers);
        int maximum =  sum(numbers) - maximum(numbers);

        return new int[]{minimum , maximum};
    }



}
