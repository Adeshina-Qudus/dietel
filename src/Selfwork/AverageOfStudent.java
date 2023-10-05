package Selfwork;

import java.util.Scanner;

public class AverageOfStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        int total = 0;
        int average = 0;

        while( number < 10 ){
            System.out.print("ENTER YOUR SCORE : ");
            int userInput = input.nextInt();
            total += userInput;
            number++;
            average = total / number;
        }
        System.out.println();
        System.out.println("THE TOTAL OF SCORE IS : " +total);
        System.out.println();
        System.out.println("TOTAL AVERAGE IS : " +average);
    }
}
