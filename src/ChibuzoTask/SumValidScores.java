package ChibuzoTask;

import java.util.Scanner;

public class SumValidScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 10; count++){
            System.out.println("ENTER YOUR SCORE ");
            int userInput = input.nextInt();
            if (userInput >= 1 && userInput <= 100) {
                sum += userInput;
            }
        }
        System.out.println(sum);
    }
}
