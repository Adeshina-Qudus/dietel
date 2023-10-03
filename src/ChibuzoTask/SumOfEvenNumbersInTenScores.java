package ChibuzoTask;

import java.util.Scanner;

public class SumOfEvenNumbersInTenScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.println("ENTER YOUR SCORE ");
            int userInput = input.nextInt();
            if (userInput % 2 == 0) {
                sum += userInput;
            }
        }
        System.out.println("sum of even numbers is "+sum);

    }
}
