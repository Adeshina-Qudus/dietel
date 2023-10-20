package ProgramizArrayQuestions;

import Chapter4.SalesCommissionCalculator;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] numbers = new int[10];
        int evenNumbers = 0;
        for (int count = 0; count < numbers.length; count++){
            System.out.println("Enter number "+(count + 1));
            numbers[count] = input.nextInt();
            }
        for (int counter : numbers) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
        }
        }

    }

