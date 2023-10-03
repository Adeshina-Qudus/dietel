package ChibuzoTask;

import java.util.Scanner;

public class TenScoresAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int average = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.println("ENTER YOUR SCORE ");
            int userInput = input.nextInt();
            sum += userInput;
            counter += 1;
            average = sum / counter;
        }
        System.out.println("Average of score is "+average);
    }
}
