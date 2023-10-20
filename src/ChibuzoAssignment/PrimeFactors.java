package ChibuzoAssignment;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(primeFacto(String.valueOf(100))));
    }
    public static String primeNumbers(int userInput) {
        int divide = 0;
        int reminder = 0;
        StringBuilder result = new StringBuilder();
        for (int count = 2; count <= userInput; count++) {
            boolean condition = true;
            while (condition) {
                reminder = userInput % count;
                if (reminder != 0) {
                    count++;
                    divide = userInput;
                }
                if (reminder == 0) {
                    divide = userInput / count;
                    result.append(count);
                }
                if (divide == 1) {
                    condition = false;
                }
                userInput = divide;
            }
        }
        return result.toString();
    }


    public static int [] primeFacto(String number ){
        number = primeNumbers(Integer.parseInt(number));

        int [] result = new int [number.length()] ;
        for (int count = 0 ; count < number.length() ; count++){
            result[count] =Integer.parseInt(String.valueOf(number.charAt(count)));

        }
        return result;
    }
}
