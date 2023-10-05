package ChibuzoAssignment;


import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("enter integer between 0 and 1000: ");
        int userInput = input.nextInt();


        int number1 = userInput / 100;
        int number2 = userInput/10 %10;
        int number3 = userInput % 10;


        int result = number1 + number2 + number3;


        System.out.printf("sum of digits is: %d%n" , result);


    }

}


