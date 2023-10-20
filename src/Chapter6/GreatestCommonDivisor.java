package Chapter6;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number ");
        int firstInput = input.nextInt();
        System.out.println("enter second Number ");
        int secondInput = input.nextInt();
        System.out.println(greatestCommonDivisor(firstInput, secondInput));
    }
    public static int greatestCommonDivisor(int firstNumber , int secondNumber){

        int divide = 0 ;
        int reminder = 0;
        boolean condition = true;
        while (condition){
            divide = firstNumber / secondNumber;
            reminder = firstNumber % secondNumber;
            if (reminder == 0){
                condition = false;
            }
            firstNumber = secondNumber;
            secondNumber = reminder;
        }
        return firstNumber;
    }
}
