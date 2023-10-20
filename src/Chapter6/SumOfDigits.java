package Chapter6;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A FOUR DIGIT NUMBER ");
        int digit = input.nextInt();
        System.out.println("THE SUM OF "+digit+" IS "+sumOfDigits(digit));
    }

    public static int sumOfDigits(int numbers){
        int number = numbers;
        int sum = 0;
        int digit ;
        while (number != 0) {

            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
