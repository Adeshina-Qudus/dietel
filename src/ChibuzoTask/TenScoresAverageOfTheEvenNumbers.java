package ChibuzoTask;

import java.util.Scanner;

public class TenScoresAverageOfTheEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int average = 0;
        int count = 1;
        for (; count <= 10; count++) {
            System.out.println("ENTER YOUR SCORE ");
            int userInput = input.nextInt();
            if (userInput % 2 == 0) {
                sum += userInput;
                counter += 1;
            }
        }
        average = sum / counter;
        System.out.println("average of even number is "+average);
    }
}
